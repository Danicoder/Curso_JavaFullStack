package compuntuacion.puntuacion.puntuaciones;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PuntuacionService {
    private final PuntuacionRepository puntRepository;

    public List<Puntuacion> getPuntuaciones() {
        return (List<Puntuacion>) puntRepository.findAll();
    }

    public Puntuacion getPuntucion(int id) {
        return puntRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Puntuación no encontrada"));
   }

    public Puntuacion insert(Puntuacion p) {
        return puntRepository.save(p);
    }
    
    public Puntuacion update(Puntuacion p, int id) {
        if(!puntRepository.existsById(id)) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Puntuación no encontrada");
        }
        p.setId(id); // Al tener una id hace un update en lugar de un insert
        return puntRepository.save(p);
    }
    public void delete(int id) {
        puntRepository.deleteById(id);
    }
}
/*
 - El método .save() si no tiene id hace un insert, de lo contrario hace un update
 - Con .orElse(null) devuelve null en  caso de no existir. Supplier no recibe parámtro pero devuelve algo
*/
