package com.equipojugador.jugadorequipo.equipo;

import java.util.List;

import org.springframework.data.jdbc.core.JdbcAggregateTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import lombok.RequiredArgsConstructor;

@Service //@Service -> Gestiona las operaciones (lógica de negocio)
@RequiredArgsConstructor 
public class equipoService {
    private final equipoRepository equipoRepository;
    private final JdbcAggregateTemplate JdbcTemplate; //sí tiene la id distinto de cero me hace la insert o si no no

    //Obtiene la lista de equipo mediante la id del jugador
    public List<equipo> getAll(){
        return (List<equipo>) equipoRepository.findAll(); //métdodo de Spring qué devuelve todo
    }
    //obtiene la lista de los nombres indicados
    public List<equipo> getByNombre(String nombre) {
        return equipoRepository.findByNombreContaining(nombre);
    }
    //obtiene la lista de las ciudades indicadas
    public List<equipo> getByCiudad(String ciudad) {
        return equipoRepository.findByCiudad(ciudad);
    }

    public equipo getById(int id) {
        return equipoRepository.findById(id).orElseThrow(
            () -> new ResponseStatusException(HttpStatus.NOT_FOUND,"equipo no encontrado")
        );
    }
    public equipo insert(equipo e){
        return JdbcTemplate.insert(e);
    }
    public void delete(int id) {
        //JdbcTemplate.deleteById(id,equipo.class);
        equipoRepository.deleteById(id);
    }
}
