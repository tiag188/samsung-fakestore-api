package com.samsung.fakestore.infrastructure.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    public static final String ORDERS_QUEUE = "orders-queue";

    @Bean
    public Queue ordersQueue() {
        return new Queue(ORDERS_QUEUE, false);
    }
}