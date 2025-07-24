package com.ecommerce.catlogProducts.service;

import com.ecommerce.catlogProducts.model.Product;
import com.ecommerce.catlogProducts.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSevice {

    private final ProductRepository productRepository;

    public ProductSevice(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategory(Long categoryId){

        return productRepository.findByCategoryId(categoryId);

    }
}
