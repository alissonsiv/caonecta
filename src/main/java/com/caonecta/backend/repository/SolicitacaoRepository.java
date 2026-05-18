package com.caonecta.backend.repository;

import com.caonecta.backend.entity.SolicitacaoAdocao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitacaoRepository extends JpaRepository<SolicitacaoAdocao, Long> {
}