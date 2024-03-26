package com.example.sccvapi.service;

import com.example.sccvapi.model.entity.Telefone;
import com.example.sccvapi.model.repository.TelefoneRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TelefoneService {

    private TelefoneRepository repository;

    public TelefoneService(TelefoneRepository repository){
        this.repository = repository;
    }

    public List<Telefone> getTelefones(){
        return repository.findAll();
    }

    public Optional<Telefone> getTelefoneById(Long id){
        return repository.findById(id);
    }
}
