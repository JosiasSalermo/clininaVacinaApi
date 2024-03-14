package com.example.sccvapi.model.repository;

import com.example.sccvapi.model.entity.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}
