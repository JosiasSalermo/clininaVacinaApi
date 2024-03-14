package com.example.sccvapi.model.repository;

import com.example.sccvapi.model.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
