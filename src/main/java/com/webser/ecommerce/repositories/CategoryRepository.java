package com.webser.ecommerce.repositories;

import com.webser.ecommerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {
}
