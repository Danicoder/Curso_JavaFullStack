package com.muchosamuchos.relaciones.eventos.dto;

import java.util.List;

import com.muchosamuchos.relaciones.eventos.Proyecciones.EventoSinUsuarios;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RespuestaEventosDto {
    List<EventoSinUsuarios> eventos;
}
