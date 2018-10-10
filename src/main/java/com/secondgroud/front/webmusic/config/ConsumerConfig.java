package com.secondgroud.front.webmusic.config;

import com.rabbitmq.client.Channel;
import com.secondgroud.front.webmusic.socket.WebSocketServerEndpoint;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.ChannelAwareMessageListener;
import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.messaging.handler.annotation.support.DefaultMessageHandlerMethodFactory;
 
import java.io.IOException;
 
 
@Configuration
@EnableRabbit
@Slf4j
public class ConsumerConfig implements RabbitListenerConfigurer {
 
    @Autowired
    private ConnectionFactory connectionFactory;
 
    @Autowired
    private WebSocketServerEndpoint webSocketServerEndpoint;
 
    @Bean
    public DefaultMessageHandlerMethodFactory handlerMethodFactory() {
        DefaultMessageHandlerMethodFactory factory = new DefaultMessageHandlerMethodFactory();
        factory.setMessageConverter(new MappingJackson2MessageConverter());
        return factory;
    }
 
    @Bean
    public SimpleMessageListenerContainer messageContainer(@Qualifier("queueTransaction") Queue transaction, @Qualifier("queueContract") Queue contract, @Qualifier("queueQualification") Queue qualification) {
        SimpleMessageListenerContainer container = new SimpleMessageListenerContainer(connectionFactory);
        container.setQueues(transaction, contract, qualification);
        container.setMaxConcurrentConsumers(1);
        container.setConcurrentConsumers(1);
        container.setAcknowledgeMode(AcknowledgeMode.MANUAL); //设置确认模式手工确认
        container.setMessageListener(new ChannelAwareMessageListener() {
            @Override
            public void onMessage(Message message, Channel channel) throws Exception {
                byte[] body = message.getBody();
                log.info("receive msg : " + new String(body));
                try {
                    webSocketServerEndpoint.sendMessageToAll(new String(body));
                    channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);//确认消息成功消费
                } catch (IOException e) {
                    log.error("消息推送前台出错：" + e.getMessage() + "/r/n重新发送");
                    channel.basicNack(message.getMessageProperties().getDeliveryTag(), false, true); //重新发送
                }
            }
        });
        return container;
    }
 
    @Override
    public void configureRabbitListeners(RabbitListenerEndpointRegistrar rabbitListenerEndpointRegistrar) {
        rabbitListenerEndpointRegistrar.setMessageHandlerMethodFactory(handlerMethodFactory());
    }
}
