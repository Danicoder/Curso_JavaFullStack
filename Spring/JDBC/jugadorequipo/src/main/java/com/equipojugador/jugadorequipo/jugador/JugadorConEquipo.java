package com.equipojugador.jugadorequipo.jugador;
import com.equipojugador.jugadorequipo.equipo.equipo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class JugadorConEquipo extends jugador {
    equipo equipo;

    public JugadorConEquipo(int id, String nombre, int numero, double sueldo, int idEquipo, equipo equipo) {
        super(id, nombre, numero, sueldo, idEquipo);
        this.equipo = equipo;
    }

    public JugadorConEquipo(jugador j, equipo equipo) {
        super(j.getId(), j.getNombre(), j.getNumero(), j.getSueldo(), j.getIdEquipo());
        this.equipo = equipo;
    }
}
