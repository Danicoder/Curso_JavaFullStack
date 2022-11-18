package com.equipojugador.jugadorequipo.jugador;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data@AllArgsConstructor
public class jugador<tinyint> {
    @Id private int id;
    private String nombre;
    private int numero;
    private double sueldo;
    //cómo la llamo distinto al campo de la tabla de la BD con Column 
    //la referencia correctamente.
    @Column("equipo")
    private int idEquipo; 
}
