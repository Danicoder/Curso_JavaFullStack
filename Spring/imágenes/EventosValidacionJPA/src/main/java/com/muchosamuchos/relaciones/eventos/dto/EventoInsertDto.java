package com.muchosamuchos.relaciones.eventos.dto;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@NoArgsConstructor@AllArgsConstructor
public class EventoInsertDto {
    private int id;
    @NotBlank(message = "El titulo no debe estar vacío")
    @Length(min = 5, message = "El título debe tener al menso 5 caracteres")
    private String titulo;
    @NotBlank(message = "La descripción no puede estar vacía")
    private String descripcion;
    @Positive(message = "El precio debe tener un valor mayor a cero")
    private double precio;
    //@NonNull(message = "La fecha no debe estar vacía")
    @Future(message = "La fecha no debe ser posterior a hoy")
    private LocalDate fecha;
    private String imagen;
}
