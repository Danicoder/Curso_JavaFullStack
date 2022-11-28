package com.muchosamuchos.relaciones.eventos.Proyecciones;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;

import com.muchosamuchos.relaciones.usuarios.Proyecciones.UsuarioSinEventos;

public interface EventoConUsuarios extends EventoSinUsuarios{
    @Value("#{target.usuarios}")
    List<UsuarioSinEventos> getUsuarios();
}
