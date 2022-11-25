package com.muchosamuchos.relaciones.usuarios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muchosamuchos.relaciones.usuarios.Proyecciones.UsuarioConEventos;
import com.muchosamuchos.relaciones.usuarios.Proyecciones.UsuarioSinEventos;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{
    //devuelve la lista de los usuarios sin eventos
    List<UsuarioSinEventos> findBy();
    //devuelve la lista del usuario con eventos asociados
    UsuarioConEventos findUsuarioById(int idUsuario);
}
