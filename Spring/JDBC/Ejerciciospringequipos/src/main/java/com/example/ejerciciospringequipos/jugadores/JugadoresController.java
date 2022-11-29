package com.example.ejerciciospringequipos.jugadores;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/jugadores")
@RequiredArgsConstructor
@CrossOrigin(origins = "*") //Dar permiso a la url indicada, en nuestro caso *
public class JugadoresController {
  private final JugadoresService jugadoresService;

  /*@GetMapping
  public List<Jugador> getEquipos(@RequestParam(required = false, defaultValue = "0") int equipo,
      @RequestParam(required = false) String ciudad) {
    if (equipo != 0) {
      return jugadoresService.getByEquipo(equipo);
    } else if (ciudad != null) {
      return jugadoresService.getByCiudad(ciudad);
    } else {
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Debes proporcionar el equipo o la ciudad");
    }
  }*/
  
  @GetMapping
  public List<Jugador> GetJugadores() {
    return jugadoresService.GetJugadores();
  }

  @GetMapping("/{id}")
  public Jugador getById(@PathVariable int id) {
      return jugadoresService.getById(id);
  }

  @PostMapping
  public Jugador insert(@RequestBody Jugador jugador) {
    return jugadoresService.insert(jugador);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(int id) {
    jugadoresService.delete(id);
  }
}
