package puntuaciones;

import java.util.List;

import org.springframework.data.relational.core.conversion.DbActionExecutionException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    public List<puntuacion> getPuntuaciones() {
        return puntService.getPuntuaciones();
    }
    @GetMapping("/{id}")
    public ResponseEntity<puntuacion> getPuntuacion(int id) {
        try {
            puntuacion p = puntService.getPuntucion(id);
            return ResponseEntity.ok(p);
        } catch (DbActionExecutionException e) {
            return ResponseEntity.notFound().build(); //404
        }
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) 
    public puntuacion insertPuntucion(@RequestBody puntuacion p) {
        return puntService.insert(p);
    }
    /*@PutMapping("/{id}")
    public ResponseEntity<Puntuacion> updateCategory(@RequestBody Category c,@PathVariable int id) {
        try {
            Puntuacion updated = catService.update(c, id);
            return ResponseEntity.ok(updated);
        } catch (DbActionExecutionException e) {
           return ResponseEntity.notFound().build(); //404 NOT FOUND
        }
    }*/
}
