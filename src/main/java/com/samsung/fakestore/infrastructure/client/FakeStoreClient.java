
package com.samsung.fakestore.infrastructure.client;

import com.samsung.fakestore.application.dto.*;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

@Component
public class FakeStoreClient {

    private static final String BASE_URL = "https://fakestoreapi.com";
    private final RestTemplate restTemplate;
    private static final HttpHeaders headers = new HttpHeaders();

    public FakeStoreClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<UserDTO> fetchUsers() {
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<Void> entity = new HttpEntity<>(headers);

        ResponseEntity<UserDTO[]> response = restTemplate.exchange(
                BASE_URL + "/users",
                HttpMethod.GET,
                entity,
                UserDTO[].class);

        return Arrays.asList(response.getBody());

    }

    public List<ProductDTO> fetchProducts() {
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<Void> entity = new HttpEntity<>(headers);

        ResponseEntity<ProductDTO[]> response = restTemplate.exchange(
                BASE_URL + "/products",
                HttpMethod.GET,
                entity,
                ProductDTO[].class);

        return Arrays.asList(response.getBody());
    }

    public List<CartDTO> fetchCarts() {
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        HttpEntity<Void> entity = new HttpEntity<>(headers);

        ResponseEntity<CartDTO[]> response = restTemplate.exchange(
                BASE_URL + "/carts",
                HttpMethod.GET,
                entity,
                CartDTO[].class);

        return Arrays.asList(response.getBody());
    }
}
