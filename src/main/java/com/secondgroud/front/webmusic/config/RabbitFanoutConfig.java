package com.secondgroud.front.webmusic.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitFanoutConfig {

    final static String QUEUE1 = "QUEUE1";

    final static String QUEUE2 = "QUEUE2";

    final static String EXCHANGE="EXCHANGE";

    @Bean
    public Queue queue(){
        return new Queue(RabbitFanoutConfig.QUEUE1);
    }

    @Bean
    public Queue queue1(){
        return new Queue(RabbitFanoutConfig.QUEUE2);
    }

    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange(RabbitFanoutConfig.EXCHANGE);
    }

    @Bean
    public Binding bindingExchangeQueue(Queue queue, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(queue).to(fanoutExchange);
    }

    @Bean
    public Binding bindingExchangeQueue1(Queue queue1, FanoutExchange fanoutExchange) {
        return BindingBuilder.bind(queue1).to(fanoutExchange);
    }
}
