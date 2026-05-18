package com.caonecta.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "animais")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Animal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String especie;

    private Integer idade;

    private String descricao;

    private Boolean disponivel;

    private Boolean aprovado;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}