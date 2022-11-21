package com.example.ejemplospring1.products;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Product, Integer> {
    @Query("SELECT p.* FROM product WHERE p.category = :category")
    List<Product> findByCategory(@Param("category") int category);
}
