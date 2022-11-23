package com.example.ejemplospring1.categories;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Category {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "category", cascade = CascadeType.PERSIST)
    /*@OneToMany(mappedBy = "category")
    @JoinColumn(name="category") // Nombre de la columna con la clave ajena*/
    private Category category;

}

// Esto equivale más o menos a lo de arriba
// public record Category(@Id int id, String name) {}
