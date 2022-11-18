package com.equipojugador.jugadorequipo.jugador;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jugadorRepository extends CrudRepository<jugador,Integer>{
    //Jugadores cuyo sueldo sea mayor a 4000
    List<jugador> findBySueldoGreaterThanEqual(double sueldo);
}
