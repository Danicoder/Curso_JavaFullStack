package com.example.ejemplospring1.categories.proyecciones;

import java.util.List;

import com.example.ejemplospring1.products.Proyecciones.ProductWithCategory;

public interface CategoryWithProduct {
    int getId();
    String getName();
    List<ProductWithCategory> getProducts();
}
