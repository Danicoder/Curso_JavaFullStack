package com.example.ejemplospring1.products;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.ejemplospring1.categories.CategoriesRepository;
import com.example.ejemplospring1.products.Proyecciones.ProductWithCategory;
import com.example.ejemplospring1.products.Proyecciones.ProductWithOutCategory;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class ProductsService {
    private final ProductsRepository prodRepository;
    private final CategoriesRepository catRepository;

    public List<ProductWithOutCategory> getProducts(int idCat) {
        return prodRepository.findByCategory(idCat);
    }

    public ProductWithCategory getProduct(int idProd) {
        return prodRepository.findByProductById(idProd).orElseThrow(
            () -> new ResponseStatusException(HttpStatus.NOT_FOUND,"Producto no encontrado") 
        );
    }

    public Product insertProduct(Product p) {
        if(!catRepository.existsById(p.getCategory().getId())) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria no encontrada");
        }
        return prodRepository.save(p);
    }

    public void deleteProduct(int id) {
        prodRepository.deleteById(id);
    }
}
