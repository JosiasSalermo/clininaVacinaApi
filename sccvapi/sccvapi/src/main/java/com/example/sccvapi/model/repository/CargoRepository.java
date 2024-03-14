package com.example.sccvapi.model.repository;

import com.example.sccvapi.model.entity.Cargo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargoRepository extends JpaRepository<Cargo, Long> {
}
