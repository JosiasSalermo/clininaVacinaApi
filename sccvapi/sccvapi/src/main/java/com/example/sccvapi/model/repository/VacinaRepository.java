package com.example.sccvapi.model.repository;

import com.example.sccvapi.model.entity.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacinaRepository extends JpaRepository<Vacina, Long> {
}
