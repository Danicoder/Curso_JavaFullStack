package com.example.ejemplospring1.products;

import com.example.ejemplospring1.categories.pproyecciones.CategoryWithoutProducts;

import lombok.Getter;
import lombok.Setter;

@Setter@Getter
public class ProductWithCategory extends Product {
    private CategoryWithoutProducts category;

    public ProductWithCategory(int id, String reference, String name, double price, int idCategory, CategoryWithoutProducts category) {
        super(id, reference, name, price, idCategory);
        this.category = category;
    }

    public ProductWithCategory(Product p, CategoryWithoutProducts category) {
        super(p.getId(), p.getReference(), p.getName(), p.getPrice(), category.getId());
        this.category = category;
    }
}
