package com.equipojugador.jugadorequipo.jugador;

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

@RestController
@RequiredArgsConstructor
@RequestMapping("/jugadores")
public class jugadorController {
    //inyectar en el constructor:
    private final jugadorService JugadorService;

    @GetMapping
    public List<jugador> getJugadoresSueldo(@RequestParam(required = false) Double sueldo) {
        if(sueldo > 0){return JugadorService.getSueldoMayor(sueldo);}
        else{return JugadorService.getAlLList();}
    }

    @GetMapping("/{id}")
    public jugador getId(@PathVariable int id) {
        return JugadorService.getById(id);
    }
    @PostMapping()
    public jugador insertJugador(@RequestBody jugador j){
        return JugadorService.insert(j);
    }
    @DeleteMapping("/{id}/jugador/{idEquipo}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204 informa que el servidor ha procesado con éxito la solicitud
    public void deleteJugador(@PathVariable int id) {
        JugadorService.delete(id);
    }
    /*Crear método para obtener jugadores de equipos de una ciudad determinada*/
}
