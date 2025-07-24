package com.ecommerce.catlogProducts.controller;


import com.ecommerce.catlogProducts.model.Product;
import com.ecommerce.catlogProducts.service.ProductSevice;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductSevice productSevice;

    public ProductController(ProductSevice productSevice) {
        this.productSevice = productSevice;
    }
    @GetMapping
    public List<Product> getAllProducts(){
        return productSevice.getAllProducts();
    }


    @GetMapping("/category/{categoryId}")
    public List<Product> getProductByCategory(@PathVariable  Long categoryId){
        return productSevice.getProductsByCategory(categoryId);
    }
}
