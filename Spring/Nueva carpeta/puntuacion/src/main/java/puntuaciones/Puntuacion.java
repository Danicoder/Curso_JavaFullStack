package com.spring.ejemplospring1.categories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class puntuacion {
    @id private int id;
    private String jugador;
    private int puntuacion;
}
