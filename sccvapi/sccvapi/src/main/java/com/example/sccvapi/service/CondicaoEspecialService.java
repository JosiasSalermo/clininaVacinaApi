package com.example.sccvapi.service;

import com.example.sccvapi.model.entity.CondicaoEspecial;
import com.example.sccvapi.model.repository.CondicaoEspecialRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CondicaoEspecialService {

    private CondicaoEspecialRepository repository;

    public CondicaoEspecialService(CondicaoEspecialRepository repository){
        this.repository = repository;
    }

    public List<CondicaoEspecial> getCondicoesEspeciais(){
        return repository.findAll();
    }

    public Optional<CondicaoEspecial> getCondicaoEspecialById(Long id){
        return repository.findById(id);
    }
}
