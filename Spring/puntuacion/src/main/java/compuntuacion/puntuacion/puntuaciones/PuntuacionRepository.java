package compuntuacion.puntuacion.puntuaciones;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository                                                    //le paso la cp y sú tipo
public interface PuntuacionRepository extends CrudRepository<Puntuacion,Integer> {}