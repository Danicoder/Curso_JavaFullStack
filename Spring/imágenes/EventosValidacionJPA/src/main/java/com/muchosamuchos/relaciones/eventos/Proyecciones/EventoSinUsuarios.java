package com.muchosamuchos.relaciones.eventos.Proyecciones;

import java.time.LocalDate;

public interface EventoSinUsuarios {
    int getId();
    String gettitulo();
    String getdescripcion();
    double getprecio();
    LocalDate getfecha();
}
