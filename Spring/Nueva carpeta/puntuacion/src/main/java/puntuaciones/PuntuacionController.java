package puntuaciones;

import java.util.List;

import org.springframework.data.relational.core.conversion.DbActionExecutionException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
@RequestMapping("/puntuacion")
@RequiredArgsConstructor
public class PuntuacionController {
    private final PuntuacionService puntService;

    @GetMapping
    public List<Puntuacion> getPuntuaciones() {
        return puntService.getPuntuaciones();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Puntuacion> getPuntuacion(int id) {
        try {
            Puntuacion p = puntService.getPuntucion(id);
            return ResponseEntity.ok(p);
        } catch (DbActionExecutionException e) {
            return ResponseEntity.notFound().build(); //404
        }
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) 
    public Puntuacion insertPuntucion(@RequestBody Puntuacion p) {
        return puntService.insert(p);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Puntuacion> updatePuntuacion(@RequestBody Puntuacion c,@PathVariable int id) {
        try {
            Puntuacion updated = puntService.update(c, id);
            return ResponseEntity.ok(updated);
        } catch (DbActionExecutionException e) {
           return ResponseEntity.notFound().build(); //404 NOT FOUND
        }
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePuntuacion(@PathVariable int id){
        puntService.delete(id);
    }
}
