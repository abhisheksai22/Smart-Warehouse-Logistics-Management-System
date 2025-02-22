package com.abhishek.logistic.service;

import com.abhishek.logistic.dto.ProductDto;
import com.abhishek.logistic.dto.mappers.ProductMapper;
import com.abhishek.logistic.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;


    public ProductDto addProduct(ProductDto productDTO) {
        return productMapper.productToProductDto(productRepository.save(productMapper.productDtoToProduct(productDTO)));
    }
}
