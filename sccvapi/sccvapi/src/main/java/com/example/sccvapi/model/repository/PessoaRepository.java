package com.example.sccvapi.model.repository;

import com.example.sccvapi.model.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
}
