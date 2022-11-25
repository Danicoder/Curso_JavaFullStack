package com.muchosamuchos.relaciones.usuarios.Proyecciones;

import java.util.List;

import com.muchosamuchos.relaciones.eventos.Proyecciones.EventoSinUsuarios;

public interface UsuarioConEventos extends UsuarioSinEventos{
    List<EventoSinUsuarios> getEventos();
}
