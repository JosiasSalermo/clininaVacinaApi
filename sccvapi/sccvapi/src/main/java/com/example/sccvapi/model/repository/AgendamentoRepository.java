package com.example.sccvapi.model.repository;

import com.example.sccvapi.model.entity.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}
