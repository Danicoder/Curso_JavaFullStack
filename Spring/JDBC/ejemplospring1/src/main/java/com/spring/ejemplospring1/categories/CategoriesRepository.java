package com.spring.ejemplospring1.categories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriesRepository extends CrudRepository<Category,Integer>{
    /*@Query("SELECT * FROM category WHERE name LIKE %:nombre%")
    List<Category> buscarNombre(String nombre);*/

    //Otra forma de hacerlo
    List<Category> findByFirstnameContaining(String name);
    
}
