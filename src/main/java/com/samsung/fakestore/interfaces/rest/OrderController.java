package com.samsung.fakestore.interfaces.rest;

import com.samsung.fakestore.application.dto.CartDTO;
import com.samsung.fakestore.application.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public void createOrder(@RequestBody CartDTO cart) {
        orderService.createOrder(cart);
    }
}