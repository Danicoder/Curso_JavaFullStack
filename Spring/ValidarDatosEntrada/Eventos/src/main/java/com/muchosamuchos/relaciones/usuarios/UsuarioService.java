package com.muchosamuchos.relaciones.usuarios;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.muchosamuchos.relaciones.usuarios.Proyecciones.UsuarioConEventos;
import com.muchosamuchos.relaciones.usuarios.Proyecciones.UsuarioSinEventos;

import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public List<UsuarioSinEventos> getAll() {
        return usuarioRepository.findBy();
    }
    public UsuarioConEventos getById(int id) {
        UsuarioConEventos u = usuarioRepository.findUsuarioById(id);
        if(u == null){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Usuario no encontrada");
        }
        return u;
    }

    public Usuario insert(Usuario u) {
        u.setId(0);
        return usuarioRepository.save(u);
    }

    public void delete(int idUsuario) {
        usuarioRepository.deleteById(idUsuario);
    }
}
