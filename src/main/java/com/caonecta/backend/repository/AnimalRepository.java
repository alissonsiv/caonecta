package com.caonecta.backend.repository;

import com.caonecta.backend.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimalRepository extends JpaRepository<Animal, Long> {

    List<Animal> findByDisponivelTrueAndAprovadoTrue();
}