package com.equipojugador.jugadorequipo.jugador;

import java.util.List;

import org.springframework.data.jdbc.core.JdbcAggregateTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.server.ResponseStatusException;

import com.equipojugador.jugadorequipo.equipo.equipo;
import com.equipojugador.jugadorequipo.equipo.equipoRepository;

import lombok.RequiredArgsConstructor;
//Gestión de las operaciones de BBD
@Service //gestiona la lógica de negocio
@RequiredArgsConstructor
public class jugadorService {
    private final jugadorRepository jugadorRepository;
    private final equipoRepository equipoRepository;
    private final JdbcAggregateTemplate JdbcTemplate; //para controlar el valor de la id enfunción del update or insert
    
    public List<jugador> getByEquipo(int id ) {
        return (List<jugador>) jugadorRepository.findByIdEquipo(id); //devuelve todas las instancias de equipo
    }
    public List<jugador> getByCiudad(String ciudad) {
        return (List<jugador>) jugadorRepository.findByCiudad(ciudad); //devuelve todas las instancias de equipo
    }    
    //obtiene el objeto sí existe la id
    public jugador getById(int id) {
        jugador j  =  jugadorRepository.findById(id).orElseThrow(
            () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Jugador no encontrado"));
            equipo e = equipoRepository.findById(j.getIdEquipo()).get();
            return new JugadorConEquipo(j,e);
    }
    public jugador insert(jugador j) {
        return JdbcTemplate.save(j);
    }
    public void delete(int id) {
        jugadorRepository.deleteById(id);
    }
}
