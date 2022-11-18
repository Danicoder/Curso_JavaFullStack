package com.equipojugador.jugadorequipo.equipo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface equipoRepository extends CrudRepository<equipo,Integer> {
    //Equipo en cuyo nombre esté incluido el String de búsqueda
    List<equipo> findByNombreContaining(String nombre);
    List<equipo> findByCiudad(String ciudad);
    //para filtrar por nombre y ciudad
    List<equipo> findByNombreCointainingAndCiudad(String nombre,String Ciudad);
}
