package com.example.sccvapi.service;

import com.example.sccvapi.model.entity.Fabricante;
import com.example.sccvapi.model.repository.FabricanteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FabricanteService {

    private FabricanteRepository repository;

    public FabricanteService(FabricanteRepository repository){
        this.repository = repository;
    }

    public List<Fabricante> getFabricantes(){
        return repository.findAll();
    }

    public Optional<Fabricante> getFabricanteById(Long id){
        return repository.findById(id);
    }
}
