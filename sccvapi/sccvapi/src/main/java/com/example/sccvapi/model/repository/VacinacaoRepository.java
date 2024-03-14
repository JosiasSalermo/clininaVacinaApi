package com.example.sccvapi.model.repository;

import com.example.sccvapi.model.entity.Vacinacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacinacaoRepository extends JpaRepository<Vacinacao, Long> {
}
