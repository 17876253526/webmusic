package com.secondgroud.front.webmusic.rabbitmq;

import com.alibaba.fastjson.JSONObject;
import com.secondgroud.front.webmusic.constant.RabbitConstant;
import com.secondgroud.front.webmusic.vo.MessageVo;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.rabbit.support.CorrelationData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.UUID;

@Component
public class Sender implements RabbitTemplate.ConfirmCallback, RabbitTemplate.ReturnCallback {
 
    @Autowired
    private RabbitTemplate rabbitTemplate;
 
    @PostConstruct
    public void init() {
        rabbitTemplate.setConfirmCallback(this);
        rabbitTemplate.setReturnCallback(this);
    }
 
    //消息发送确认回调方法
    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        System.out.println("消息发送成功:" + correlationData);
    }
 
    //消息发送失败回调方法
    @Override
    public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
       System.out.println("消息发送失败:" + new String(message.getBody()));
    }
 
    /**
     * 发送消息，不需要实现任何接口，供外部调用
     *
     * @param messageVo
     */
    public void send(MessageVo messageVo) {
        CorrelationData correlationId = new CorrelationData(UUID.randomUUID().toString());
        rabbitTemplate.convertAndSend(RabbitConstant.EXCHANGE, messageVo.getRoutingKey(), JSONObject.toJSON(messageVo).toString(), correlationId);
    }
}
