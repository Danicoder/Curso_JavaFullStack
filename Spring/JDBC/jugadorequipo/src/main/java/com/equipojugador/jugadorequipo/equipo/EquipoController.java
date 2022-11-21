package com.equipojugador.jugadorequipo.equipo;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController //Atiende peticiones HTTP
@RequiredArgsConstructor
@RequestMapping("/equipos")

public class EquipoController {
    private final equipoService equipoService;

    @GetMapping //Petición GET a la URL ‘/equipos
    //de este modo puede buscar por nombre o por ciudad, se inidica desde el repositorio
    public List<equipo> getEquipoAll(@RequestParam(required = false) String nombre,//puedes pasarme el nombre o no, lo que significa que es un parámetro opcional
                                     @RequestParam(required = false) String ciudad) 
    { 
        if(nombre != null){return equipoService.getByNombre(nombre);}
        else if(ciudad != null){return equipoService.getByNombre(nombre);}
        else{return equipoService.getAll();} //devuelve la lista completa de equipo
    }

    @GetMapping("/{id}")
    public equipo getById(@PathVariable int id) {
        return equipoService.getById(id);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public equipo insertEquipo(@RequestBody equipo e) { //hace referencia al objeto que nos llega desde el cliente
        return equipoService.insert(e);
    }

    @DeleteMapping("/{id}/equipo/{idJugador}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteEquipo(@PathVariable int idJugador) {
        equipoService.delete(idJugador);
    }
}
