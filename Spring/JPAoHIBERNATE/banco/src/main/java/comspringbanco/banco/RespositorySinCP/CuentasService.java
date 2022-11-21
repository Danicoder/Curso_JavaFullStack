package comspringbanco.banco.RespositorySinCP;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class CuentasService {
    private final CuentasRepository cuentasRepository;

    public List<Cuenta> getAll() {
        return cuentasRepository.findAll();
    }

    public Cuenta getByNumero(int numero) {
        return cuentasRepository.findById(numero).orElseThrow(
            () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria no encontrada") 
        );
    }

    //Sí existe y quiro que me de un error para no duplicarlo compramos con el if sí existe
    public Cuenta insert(Cuenta cuenta) {
        //hace una select y sí existe hace una insert, de lo contrario lo actualiza
        if(!cuentasRepository.existsById(cuenta.getNumero())) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Lla CUENTA YA EXISTE", null);
        }
        return cuentasRepository.save(cuenta); 
    }

    //Sí existe la cuenta hace un update, si no la inserta, pero no salta un error como en JDBC.
    public Cuenta update(Cuenta cuenta, int numero) {
        if(!cuentasRepository.existsById(numero)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cuenta no encontrada", null);
        }
        cuenta.setNumero(numero);
        return cuentasRepository.save(cuenta);
    }

    public void delete(int numero) {
        cuentasRepository.deleteById(numero);
    }
}
