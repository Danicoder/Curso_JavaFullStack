package com.equipojugador.jugadorequipo.jugador;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jugadorRepository extends CrudRepository<jugador,Integer>{
    List<jugador> findByIdEquipo (int idEquipo);
    @Query("SELECT j.* FROM jugador j INNER JOIN equipo e ON j.equipo = e.id WHERE e.ciudad = :ciudad")
    List<jugador> findByCiudad(String ciudad);
}
