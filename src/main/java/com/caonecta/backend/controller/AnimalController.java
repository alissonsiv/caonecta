package com.caonecta.backend.controller;

import com.caonecta.backend.entity.Animal;
import com.caonecta.backend.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
@CrossOrigin("*")
public class AnimalController {

    @Autowired
    private AnimalService service;

    @PostMapping
    public Animal cadastrar(@RequestBody Animal animal) {
        return service.cadastrar(animal);
    }

    @GetMapping("/disponiveis")
    public List<Animal> disponiveis() {
        return service.disponiveis();
    }

    @PutMapping("/{id}/aprovar")
    public Animal aprovar(@PathVariable Long id) {
        return service.aprovar(id);
    }
}