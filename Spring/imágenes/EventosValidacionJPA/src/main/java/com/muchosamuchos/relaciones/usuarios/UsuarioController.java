package com.muchosamuchos.relaciones.usuarios;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.muchosamuchos.relaciones.usuarios.dto.RespuestaUsuariosDto;
import com.muchosamuchos.relaciones.usuarios.dto.RespuestaUsuarioDto;
import com.muchosamuchos.relaciones.usuarios.dto.UsuarioInsertDto;


import lombok.RequiredArgsConstructor;

@RequestMapping("/usuarios")
@RestController
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioService usuarioService;

    @GetMapping
    public RespuestaUsuariosDto getAll() {
        return new RespuestaUsuariosDto(usuarioService.getById(0));
    }
    @GetMapping("/{id}")
    public RespuestaUsuarioDto getById(@PathVariable int id) {
        return new RespuestaUsuarioDto(usuarioService.getById(id));
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario insert(@RequestBody @Valid UsuarioInsertDto dto) {
        return usuarioService.insert(new Usuario(dto));
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteById(@PathVariable int id) {
        usuarioService.delete(id);
    }
}
