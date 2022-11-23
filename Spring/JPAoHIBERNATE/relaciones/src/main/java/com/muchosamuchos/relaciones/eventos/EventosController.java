package com.muchosamuchos.relaciones.eventos;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.muchosamuchos.relaciones.eventos.Proyecciones.EventoConUsuarios;
import com.muchosamuchos.relaciones.eventos.Proyecciones.EventoSinUsuarios;
import com.muchosamuchos.relaciones.eventos.dto.AsisitirEventoDTO;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/eventos")
public class EventosController {
    private final EventoService eventosService;

    @GetMapping
    public List<EventoSinUsuarios> getAll() {
        return eventosService.getAll();
    }
    @GetMapping("/{id}")
    public EventoConUsuarios getById(@PathVariable int id) {
        return eventosService.getById(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Evento insert(@RequestBody Evento e) {
        return eventosService.insert(e);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable int id) {
        eventosService.delete(id);
    }

    
    @PostMapping("{id}/asisitir")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void ASISTIReVENTO(@PathVariable int idEvento, @RequestBody AsisitirEventoDTO asistirDTO){
        eventosService.asistirEvento(idEvento, asistirDTO.getUsuario());
    }
}
