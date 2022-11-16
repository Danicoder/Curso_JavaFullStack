package compuntuacion.puntuacion.puntuaciones;

import java.util.List;
import java.util.Locale.Category;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository                                                    //le paso la cp y sú tipo
public interface PuntuacionRepository extends CrudRepository<Puntuacion,Integer> {
    @Query("SELECT * FROM category WHERE name LIKE %:nombre%")
    List<Category> buscarNombre(String nombre);
}