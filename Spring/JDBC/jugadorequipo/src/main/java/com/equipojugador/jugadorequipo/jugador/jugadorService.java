package com.equipojugador.jugadorequipo.jugador;

import java.util.List;

import org.springframework.data.jdbc.core.JdbcAggregateTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.equipojugador.jugadorequipo.jugadorRepository;

import lombok.RequiredArgsConstructor;

@Service //gestiona la lógica de negocio
@RequiredArgsConstructor
public class jugadorService {
    private final jugadorRepository jugadorRepository;
    private final JdbcAggregateTemplate JdbcTemplate; //para controlar el valor de laid enfunción del update or insert
    
    //obtiene todos los campos de la tabla jugadores
    public List<jugador> getAlLList() {
        return (List<jugador>) jugadorRepository.findAll(); //devuelve todas las instancias de equipo
    }
    //obtiene la lista de los sueldo mayores de 4000 €
    public List<jugador> getSueldoMayor(double sueldo){
        return jugadorRepository.findBySueldoGreaterThanEqual(sueldo);
    }
    //obtiene el objeto sí existe la id
    public jugador getById(int id) {
        return jugadorRepository.findById(id).orElseThrow(
            () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Jugador no encontrado")
        );
    }
    public jugador insert(jugador j) {
        return JdbcTemplate.save(j);
    }
    public void delete(int id) {
        jugadorRepository.deleteById(id);
    }
}
