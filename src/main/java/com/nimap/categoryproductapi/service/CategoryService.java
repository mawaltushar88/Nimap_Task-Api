package com.nimap.categoryproductapi.service;

import com.nimap.categoryproductapi.entity.Category;
import com.nimap.categoryproductapi.repository.CategoryRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    // Constructor injection of the CategoryRepository
    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    // Method to find a category by ID
    public Optional<Category> findById(Long id) {
        return categoryRepository.findById(id);
    }

    // Method to save or create a category
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    // Method to delete a category by ID
    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }

    // Method to get all categories with pagination
    public Page<Category> findAll(Pageable pageable) {
        return categoryRepository.findAll(pageable); // This calls the repository's findAll with pagination
    }
}
