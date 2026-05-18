package com.caonecta.backend.service;

import com.caonecta.backend.entity.Usuario;
import com.caonecta.backend.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario salvar(Usuario usuario) {
        usuario.setAprovado(false);
        usuario.setRole("USUARIO");
        return repository.save(usuario);
    }

    public List<Usuario> listarTodos() {
        return repository.findAll();
    }

    public Usuario aprovar(Long id) {
        Usuario usuario = repository.findById(id).orElseThrow();
        usuario.setAprovado(true);
        return repository.save(usuario);
    }
}