
package com.samsung.fakestore.application.dto;

import java.util.List;

public class CartDTO {
    public int id;
    public int userId;
    public String date;
    public List<ProductItemDTO> products;

    public static class ProductItemDTO {
        public int productId;
        public int quantity;
    }
}
