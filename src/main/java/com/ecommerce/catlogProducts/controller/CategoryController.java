package com.ecommerce.catlogProducts.controller;


import com.ecommerce.catlogProducts.model.Category;
import com.ecommerce.catlogProducts.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }
    @GetMapping("/allCategory")
    public List<Category> getAllCategories(){
        System.out.println(categoryService.getAllCategories());
        return categoryService.getAllCategories();
    }
}
