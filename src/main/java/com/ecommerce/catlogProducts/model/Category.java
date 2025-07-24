package com.ecommerce.catlogProducts.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    // one-to-many mapping for product
    //as one category can have many products under it
    @OneToMany(mappedBy = "category" , cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<Product> productSet;

 // when hitting the uRL   http://localhost:8084/api/categories/allCategory
 // spring will throw an ConcurrentModificationException
    // hence override the toString() method

// Hibernate is populating a Set<Product> for a Category object.
//
//Your code (e.g. System.out.println(category) or Spring debug logging) triggers the toString() method.
//
//That toString() tries to print productSet.
//
//Hibernate hasn't finished initializing the collection, so it fails.


    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
               // ", productSet=" + productSet +
                '}';
    }
}
