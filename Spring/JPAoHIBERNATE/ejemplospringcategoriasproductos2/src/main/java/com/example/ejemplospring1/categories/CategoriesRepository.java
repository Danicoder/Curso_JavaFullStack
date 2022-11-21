package com.example.ejemplospring1.categories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ejemplospring1.categories.pproyecciones.CategoryWithoutProducts;

@Repository
public interface CategoriesRepository extends JpaRepository<Category, Integer> {
    List<CategoryWithoutProducts> findByNameContaining(String name); 
    // Devuelve todas las categorías
    List<CategoryWithoutProducts> findBy();
    CategoryWithoutProducts findCategoryById(int id);
}