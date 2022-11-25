package com.muchosamuchos.relaciones.eventos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.muchosamuchos.relaciones.eventos.Proyecciones.EventoConUsuarios;
import com.muchosamuchos.relaciones.eventos.Proyecciones.EventoSinUsuarios;

@Repository
public interface EventosRepository extends JpaRepository<Evento,Integer>{
    //para que devuelva la proyyeccion
    List<EventoSinUsuarios> findBy();
    EventoConUsuarios findEventoById(int id);
}
