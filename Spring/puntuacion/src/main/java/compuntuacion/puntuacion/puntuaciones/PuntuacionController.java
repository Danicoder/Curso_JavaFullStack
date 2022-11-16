package compuntuacion.puntuacion.puntuaciones;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/puntuaciones")
@RequiredArgsConstructor
public class PuntuacionController {
    private final PuntuacionService puntService;

    @GetMapping
    public List<Puntuacion> getPuntuaciones() {
        return puntService.getPuntuaciones();
    }
    @GetMapping("/{id}")
    public Puntuacion getPuntuacion(@PathVariable int id) {
        return puntService.getPuntucion(id);
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) 
    public Puntuacion insertPuntucion(@RequestBody Puntuacion p) {
        return puntService.insert(p);
    }
    @PutMapping("/{id}")
    public Puntuacion updatePuntuacion(@RequestBody Puntuacion c,@PathVariable int id) {
        return puntService.update(c, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePuntuacion(@PathVariable int id){
        puntService.delete(id);
    }
}
