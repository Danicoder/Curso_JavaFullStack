package compuntuacion.puntuacion.puntuaciones;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Puntuacion {
    @Id private int id;
    @Column(nullable = false)
    private String jugador;
    private int puntuacion;
}
