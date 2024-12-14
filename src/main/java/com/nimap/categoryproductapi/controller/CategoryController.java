package com.nimap.categoryproductapi.controller;

import com.nimap.categoryproductapi.entity.Category;
import com.nimap.categoryproductapi.service.CategoryService;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    // Get all categories with pagination
    @GetMapping
    public Page<Category> getAllCategories(Pageable pageable) {
        return categoryService.findAll(pageable); 
    }


    // Create a new category
    @PostMapping("/add")
    public Category createCategory(@RequestBody Category category) {
        return categoryService.save(category);
    }

    // Get category by ID
    @GetMapping("/{id}")
    public Optional<Category> getCategoryById(@PathVariable Long id) {
        return categoryService.findById(id);
    }

    // Update category by ID
    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable Long id, @RequestBody Category category) {
        category.setId(id);
        return categoryService.save(category);
    }

    // Delete category by ID
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteById(id);
    }
}
