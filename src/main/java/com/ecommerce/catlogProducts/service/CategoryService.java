package com.ecommerce.catlogProducts.service;


import com.ecommerce.catlogProducts.model.Category;
import com.ecommerce.catlogProducts.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();

    }
}
