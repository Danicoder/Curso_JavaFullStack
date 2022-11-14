package com.spring.ejemplospring1.categories;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
//obtiene datos y devuelve -> métdos que se encargan de gestionar las operaciones
@Service
@RequiredArgsConstructor
public class CategorieService {
    private final CategoriesRepository catRepository;

    public List<Category> getCategories() {
        return (List<Category>) catRepository.findAll();
    }
    public Category getCategory(int id) { 
        return catRepository.findById(id).orElse(null); //si la encuentra que la devuelve y sí no que la devuelva vacía
    }
    public Category insert(Category c) {
        c.setId(0); //forzamosque haga un insert en vez de un update
        return catRepository.save(c);
    }
    public Category update(Category c, int id) {
        Category actual = getCategory(id);
        c.setId(id); //Al tner la id hace un update en vez de un insert
        return catRepository.save(c);
    }
    public void delete(int id) {
        catRepository.deleteById(id);
    }
}
