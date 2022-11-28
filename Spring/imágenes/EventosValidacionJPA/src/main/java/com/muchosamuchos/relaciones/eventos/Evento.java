package com.muchosamuchos.relaciones.eventos;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.muchosamuchos.relaciones.eventos.dto.EventoInsertDto;
import com.muchosamuchos.relaciones.usuarios.Usuario;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Evento {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private String descripcion;
    private double precio;
    private LocalDate fecha;
    private String imagen;

    @ManyToMany(mappedBy = "eventos")//indicamos que la relación ya esta mapeada en Usuario
    private List<Usuario> usuarios;

    //apartir de un objeto genere otro de otra clase, como un cosntructor de copia
    public Evento(EventoInsertDto dto) {
        this.titulo = getTitulo();
        this.descripcion = getDescripcion();
        this.precio = getPrecio();
        this.fecha = getFecha();
        this.imagen = getImagen();
    }
}
