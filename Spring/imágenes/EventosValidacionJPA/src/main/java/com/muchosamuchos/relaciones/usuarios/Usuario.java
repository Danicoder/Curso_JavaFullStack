package com.muchosamuchos.relaciones.usuarios;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.muchosamuchos.relaciones.eventos.Evento;
import com.muchosamuchos.relaciones.usuarios.dto.UsuarioInsertDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String correo;

    /*Relacion de muchos a muchos:
     * En cascada -> cuando guarde un usuario con eventos o actualice
     * los datos con usuario lo tenga en cuenta e inserte esos eventos. 
     * Así si un usuario crea eventos se sabe que se quiere hacer una 
     * relación con ese evento.
     * Hará que un usuario añada o quite en la tabla intermedia.
    */
    @ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE
    })
    //Información de la tabla intermedia -> usuario asiste a eventos
    @JoinTable(
        name = "usuario_asiste_evento", //columna hace de CA
        joinColumns = @JoinColumn(name = "usuario"), //columna o colunas que hace referencia a la tabla actual en la clase en la que estoy
        inverseJoinColumns = @JoinColumn(name = "evento")) //Columna que hace de CA
    private List<Evento> eventos;

    public Usuario(UsuarioInsertDto dto){
        this.nombre = getNombre();
        this.correo = getCorreo();
    }
}
