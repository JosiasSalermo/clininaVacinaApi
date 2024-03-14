package com.example.sccvapi.model.repository;

import com.example.sccvapi.model.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
