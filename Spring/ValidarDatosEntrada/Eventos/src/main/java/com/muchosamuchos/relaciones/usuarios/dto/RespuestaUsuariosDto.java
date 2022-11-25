package com.muchosamuchos.relaciones.usuarios.dto;


import com.muchosamuchos.relaciones.usuarios.Proyecciones.UsuarioConEventos;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RespuestaUsuariosDto {
    UsuarioConEventos usuario;
}
