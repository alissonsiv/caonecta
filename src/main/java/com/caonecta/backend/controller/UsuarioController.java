package com.caonecta.backend.controller;

// CORREÇÃO: Alterado de Animal para Usuario
import com.caonecta.backend.entity.Usuario;
import com.caonecta.backend.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @PostMapping
    public Usuario cadastrar(@RequestBody Usuario usuario) {
        return service.salvar(usuario);
    }

    @GetMapping
    public List<Usuario> listar() {
        return service.listarTodos();
    }

    @PutMapping("/{id}/aprovar")
    public Usuario aprovar(@PathVariable Long id) {
        return service.aprovar(id);
    }
}