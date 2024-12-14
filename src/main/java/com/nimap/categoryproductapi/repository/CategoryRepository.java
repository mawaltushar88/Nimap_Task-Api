package com.nimap.categoryproductapi.repository;

import com.nimap.categoryproductapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // JpaRepository already provides the findAll(Pageable pageable) method, no need to declare it here.
}
