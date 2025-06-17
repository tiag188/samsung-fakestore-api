
package com.samsung.fakestore.domain.repository;

import com.samsung.fakestore.domain.model.Cart;
import java.util.List;

public interface CartRepository {
    List<Cart> findAll();
}
