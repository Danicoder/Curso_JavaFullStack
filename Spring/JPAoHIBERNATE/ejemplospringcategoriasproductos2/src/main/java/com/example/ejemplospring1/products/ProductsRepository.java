package com.example.ejemplospring1.products;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.ejemplospring1.products.Proyecciones.ProductWithCategory;
import com.example.ejemplospring1.products.Proyecciones.ProductWithOutCategory;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Integer> {
    @Query("SELECT p FROM product p WHERE p.category.id = :category")
    List<ProductWithOutCategory> findByCategory(@Param("category") int category);

    Optional<ProductWithCategory> findByProductById(int id);
}
