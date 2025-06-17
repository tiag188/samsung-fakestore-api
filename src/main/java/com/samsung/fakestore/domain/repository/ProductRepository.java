
package com.samsung.fakestore.domain.repository;

import com.samsung.fakestore.domain.model.Product;
import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
}
