package com.muchosamuchos.relaciones.eventos.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

/*Representa la clase del objeto que me llega.
Las DTO se crea para una clase porque esta no coincide con lo que tenemos*/

@Data @NoArgsConstructor
public class AsisitirEventoDTO {
    private int usuario;
}
