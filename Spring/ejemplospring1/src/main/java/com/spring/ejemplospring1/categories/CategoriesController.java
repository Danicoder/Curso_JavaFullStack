package com.spring.ejemplospring1.categories;

import java.util.List;

import javax.naming.NameNotFoundException;

import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.data.relational.core.conversion.DbActionExecutionException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
//atender las peticiones y llama a los métodos que se encargan de gestionar esas operaciones
@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoriesController {
    //pedir el objeto a Spring
    //@Autowired private CategorieService catService; //no es recomendable este modo
    private  final CategorieService catService;// para evitar modificarlo (final) con un constructor

    @GetMapping
    public List<Category> getCategories() {
        return catService.getCategories();
    }
    /*la variable debe coincidir con el nombre del parámetro
     * De lo contrario @PathVariable(name="id")
    */
    @GetMapping("/{id}")
    public ResponseEntity<Category> getCategory(@PathVariable int id) { 
        Category c =  catService.getCategory(id);
        if(c==null) {
            //devuelve el error 404 .build construye el objeto de catedory
            return ResponseEntity.notFound().build(); 
        }
        return ResponseEntity.ok(c);
    }
    
    @PostMapping
    /*para que por defecto devuelva un 200 en vez de un 201.
     Sí hago una consulta que no exíste no devuelve nada (vacío)*/
    @ResponseStatus(HttpStatus.CREATED) 
    public Category insertCategory(@RequestBody Category c) {
        return catService.insert(c);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> updateCategory(@RequestBody Category c,@PathVariable int id) {
        try {
            Category updated = catService.update(c, id);
            return ResponseEntity.ok(updated);
        } catch (DbActionExecutionException e) {
           return ResponseEntity.notFound().build(); //404 NOT FOUND
        }
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCategory(@PathVariable int id){
        catService.delete(id);
    }
}
