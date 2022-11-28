package com.muchosamuchos.relaciones.eventos.dto;

import com.muchosamuchos.relaciones.eventos.Proyecciones.EventoConUsuarios;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class RespuestaEventoDto {
    EventoConUsuarios evento;
}
