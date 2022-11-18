package com.equipojugador.jugadorequipo.equipo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor //cuando se enlaza un objeto en una petición post utiliza el constructor vacío
public class equipo {
    @id private int id; //@id hace referencia a la CP
    private String nombre;
    private String ciudad;
    private String fechaCreacion;//= fecha_creacion
}
