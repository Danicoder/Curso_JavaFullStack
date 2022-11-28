package com.muchosamuchos.relaciones.eventos;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.muchosamuchos.relaciones.eventos.Proyecciones.EventoConUsuarios;
import com.muchosamuchos.relaciones.eventos.Proyecciones.EventoSinUsuarios;
import com.muchosamuchos.relaciones.usuarios.Usuario;
import com.muchosamuchos.relaciones.usuarios.UsuarioRepository;
import com.muchosamuchos.relaciones.utils.ImageUtils;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventoService {
    private final EventosRepository eventosRepository;
    private final UsuarioRepository usuarioRepository;
    private final ImageUtils imageUtils;

    public List<EventoSinUsuarios> getAll() {
        return eventosRepository.findBy();
    }

    public EventoConUsuarios getById(int id) {
        EventoConUsuarios e = eventosRepository.findEventoById(id);
        if (e == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria no encontrada");
        }
        return e;
    }

    public Evento insert(Evento evento) {
        if(evento.getImagen() != null){
            //sustituye la imagen en base 64, se guarda en un archivo, me devuelve la ruta y
            //en el evento del campo imagen guardo la ruta al archivo
            evento.setImagen(imageUtils.saveImageBase64("eventos", evento.getImagen()));
        }
        return eventosRepository.save(evento);
    }

    public void delete(int idEvento) {
        eventosRepository.deleteById(idEvento);
    }

    public void asistirEvento(int idEvento, int idUsuario) {
        Evento e = eventosRepository.findById(idEvento)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Evento no encontrado"));
        Usuario u = usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado"));
        e.getUsuarios().add(u);
        u.getEventos().add(e);
        eventosRepository.save(e);
    }

    public void dejarAsistirEvento(int idEvento,int idUsuario){
        Evento e = eventosRepository.findById(idEvento).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado"));
        Usuario u = usuarioRepository.findById(idEvento).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrado"));
        e.getUsuarios().remove(u);
        u.getEventos().remove(e);
        eventosRepository.save(e);
    }
}
