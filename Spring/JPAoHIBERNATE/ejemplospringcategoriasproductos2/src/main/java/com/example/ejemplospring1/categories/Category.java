package com.example.ejemplospring1.categories;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.example.ejemplospring1.products.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Category {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;

    @OneToMany()
    @JoinColumn(name="category") // Nombre de la columna con la clave ajena
    private List<Product> products;

    public void addProduct(Product p){
        p.setIdCategory(id);
    }
}

// Esto equivale más o menos a lo de arriba
// public record Category(@Id int id, String name) {}
