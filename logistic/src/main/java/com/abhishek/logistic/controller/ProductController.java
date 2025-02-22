package com.abhishek.logistic.controller;

import com.abhishek.logistic.dto.ProductDto;
import com.abhishek.logistic.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public ProductDto createProduct(@RequestBody ProductDto productDTO) {
        return productService.addProduct(productDTO);
    }
}
