package com.caonecta.backend.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "solicitacoes_adocao")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class SolicitacaoAdocao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "animal_id")
    private Animal animal;

    private String status;
}