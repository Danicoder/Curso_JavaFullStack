package com.muchosamuchos.relaciones.usuarios.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioInsertDto {
    @NotBlank(message = "El nombre del usuario debe estar presente")
    private String nombre;
    @NotNull(message = "El correo es obligatorio")
    @Email(message = "El correo tiene un ")
    //si no pongo el not null no comprueba si es un correor
    private String correo;
}
