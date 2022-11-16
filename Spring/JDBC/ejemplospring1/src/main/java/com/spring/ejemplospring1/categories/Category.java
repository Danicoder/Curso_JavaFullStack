package com.spring.ejemplospring1.categories;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*sí la clase se llama Category debe haber una tabla con el nombre categori,
 de lo contrrío habría que indicar el nombre de la tabla con @Table("category").
 Pasa lo mismo con las columnas con ,@ Column("name"). Cuando hay imageURL
 lo lee cómo image_url*/
@Data @NoArgsConstructor @AllArgsConstructor
public class Category { 
    @Id private int id;//Indica que es la clave primária
    private String name;
}

//Tipo de clases nuevas que metió java. Clases idóneas para representar datos - Evitando usar lombok
//public Record Category(@id int id, String name) {}