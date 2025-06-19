package com.samsung.fakestore.application.services;

import com.samsung.fakestore.infrastructure.configuration.RabbitConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {
    private final RabbitTemplate rabbitTemplate;

    public OrderProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendOrder(String orderJson) {
        rabbitTemplate.convertAndSend(RabbitConfig.ORDERS_QUEUE, orderJson);
    }
}