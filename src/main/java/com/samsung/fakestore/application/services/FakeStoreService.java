
package com.samsung.fakestore.application.services;

import com.samsung.fakestore.application.dto.UserDTO;
import com.samsung.fakestore.application.dto.ProductDTO;
import com.samsung.fakestore.application.dto.CartDTO;
import com.samsung.fakestore.infrastructure.client.FakeStoreClient;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FakeStoreService {
    private final FakeStoreClient client;

    public FakeStoreService(FakeStoreClient client) {
        this.client = client;
    }

    public List<UserDTO> getAllUsers() {
        return client.fetchUsers();
    }

    public List<ProductDTO> getAllProducts() {
        return client.fetchProducts();
    }

    public List<CartDTO> getAllCarts() {
        return client.fetchCarts();
    }
}
