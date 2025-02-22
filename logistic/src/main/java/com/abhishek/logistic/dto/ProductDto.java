package com.abhishek.logistic.dto;

import lombok.Data;

@Data
public class ProductDto {
    private Long productId;
    private String productName;
    private double price;
    private int stock;
}
