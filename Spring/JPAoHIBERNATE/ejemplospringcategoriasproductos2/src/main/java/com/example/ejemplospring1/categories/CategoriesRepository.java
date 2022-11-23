package com.example.ejemplospring1.categories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ejemplospring1.categories.proyecciones.CategoryWithProduct;
import com.example.ejemplospring1.categories.proyecciones.CategoryWithoutProducts;

@Repository
public interface CategoriesRepository extends JpaRepository<Category, Integer> {
    List<CategoryWithoutProducts> findByNameContaining(String name); 
    // Devuelve todas las categorías
    List<CategoryWithoutProducts> findBy();
    Optional<CategoryWithProduct> findCategoryById(int id);
}
