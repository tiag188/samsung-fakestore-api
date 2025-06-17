
package com.samsung.fakestore.interfaces.rest;

import com.samsung.fakestore.application.dto.UserDTO;
import com.samsung.fakestore.application.services.FakeStoreService;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final FakeStoreService service;

    public UserController(FakeStoreService service) {
        this.service = service;
    }

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return service.getAllUsers();
    }
}
