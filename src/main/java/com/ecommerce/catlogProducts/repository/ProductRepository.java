package com.ecommerce.catlogProducts.repository;

import com.ecommerce.catlogProducts.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    //hibernate will form a quesry to search products based on categoryid
    // We need to follow JPA naming convention
    // like find by Category Id
    List<Product> findByCategoryId(Long categoryId);
}
