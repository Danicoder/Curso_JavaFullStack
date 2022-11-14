package puntuaciones;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Puntuaciones {
    @Id private int id;
    private String jugador;
    private int puntuacion;
}
