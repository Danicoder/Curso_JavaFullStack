package com.muchosamuchos.relaciones.eventos;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.muchosamuchos.relaciones.eventos.Proyecciones.EventoConUsuarios;
import com.muchosamuchos.relaciones.eventos.Proyecciones.EventoSinUsuarios;
import com.muchosamuchos.relaciones.usuarios.Usuario;
import com.muchosamuchos.relaciones.usuarios.UsuarioRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventoService {
    private final EventosRepository eventosRepository;
    private final UsuarioRepository usuarioRepository;

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
