package comspringbanco.banco.RespositorySinCP;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Cuenta {
    @Id private int numero;
    private String cliente;
    private double saldo;
}

