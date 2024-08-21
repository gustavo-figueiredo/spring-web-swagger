package com.example.spring_web_swagger.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring_web_swagger.model.Usuario;
import com.example.spring_web_swagger.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public List<Usuario> getUsuarios() {
        return repository.listAll();
    }

    @GetMapping("/{login}")
    public Usuario findByLogin(@PathVariable("login") String login) {
        return repository.findByLogin(login);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        repository.remove(id);
    }

    @PostMapping
    public void post(@RequestBody Usuario usuario) {
        repository.save(usuario);
    }
}
