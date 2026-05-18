package com.caonecta.backend.service;

import com.caonecta.backend.entity.Animal;
import com.caonecta.backend.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    @Autowired
    private AnimalRepository repository;

    public Animal cadastrar(Animal animal) {
        // Define valores padrão se necessário
        animal.setDisponivel(true);
        animal.setAprovado(false); // Começa como falso até o admin aprovar
        return repository.save(animal);
    }

    public List<Animal> disponiveis() {
        // Busca apenas os que estão ativos e aprovados
        return repository.findByDisponivelTrueAndAprovadoTrue();
    }

    public Animal aprovar(Long id) {
        Animal animal = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Animal não encontrado"));
        animal.setAprovado(true);
        return repository.save(animal);
    }
}