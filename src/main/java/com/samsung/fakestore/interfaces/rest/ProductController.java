package com.samsung.fakestore.interfaces.rest;

import com.samsung.fakestore.application.dto.ProductDTO;
import com.samsung.fakestore.application.services.FakeStoreService;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final FakeStoreService service;

    public ProductController(FakeStoreService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductDTO> getAllProducts() {
        return service.getAllProducts();
    }

}
