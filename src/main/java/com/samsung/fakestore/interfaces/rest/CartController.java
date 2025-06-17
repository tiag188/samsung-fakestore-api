
package com.samsung.fakestore.interfaces.rest;

import com.samsung.fakestore.application.dto.CartDTO;
import com.samsung.fakestore.application.services.FakeStoreService;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/carts")
public class CartController {
    private final FakeStoreService service;

    public CartController(FakeStoreService service) {
        this.service = service;
    }

    @GetMapping
    public List<CartDTO> getAllCarts() {
        return service.getAllCarts();
    }
}
