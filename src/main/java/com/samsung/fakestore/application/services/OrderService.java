package com.samsung.fakestore.application.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.samsung.fakestore.application.dto.CartDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderProducer orderProducer;

    private final ObjectMapper objectMapper = new ObjectMapper();

    public void createOrder(CartDTO cart) {
        try {
            // ou salvar o pedido no banco
            String orderJson = objectMapper.writeValueAsString(cart);
            orderProducer.sendOrder(orderJson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}