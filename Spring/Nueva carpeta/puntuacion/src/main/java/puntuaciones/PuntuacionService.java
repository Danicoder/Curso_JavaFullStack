package puntuaciones;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PuntuacionService {
    private final PuntuacionRepository puntRepository;

    public List<Puntuacion> getPuntuaciones() {
        return (List<Puntuacion>) puntRepository.findAll();
    }

    public Puntuacion getPuntucion(int id) {
        return puntRepository.findById(id).get();
    }

    public Puntuacion insert(Puntuacion p) {
        p.setId(0);
        return puntRepository.save(p);
    }
    
    public Puntuacion update(Puntuacion p, int id) {
        p.setId(0);
        return puntRepository.save(p);
    }
    public void delete(int id) {
        puntRepository.deleteById(id);
    }
}
