package com.example.ejemplospring1.products;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;

import com.example.ejemplospring1.categories.Category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
public class Product {
    @Id 
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String reference;
    @Column(nullable = false)
    private String name;
    private double price;

    //unos a muchos
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="category")//nombre CA
    private Category category;
}
