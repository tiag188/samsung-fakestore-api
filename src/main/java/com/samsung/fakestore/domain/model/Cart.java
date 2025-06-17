
package com.samsung.fakestore.domain.model;

import java.util.List;

public class Cart {
    public int id;
    public int userId;
    public String date;
    public List<ProductItem> products;

    public static class ProductItem {
        public int productId;
        public int quantity;
    }
}
