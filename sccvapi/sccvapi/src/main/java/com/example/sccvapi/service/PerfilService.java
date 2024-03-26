package com.example.sccvapi.service;

import com.example.sccvapi.model.entity.Perfil;
import com.example.sccvapi.model.repository.PerfilRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerfilService {

    private PerfilRepository repository;

    public PerfilService(PerfilRepository repository){
        this.repository = repository;
    }

    public List<Perfil> getPerfis(){
        return repository.findAll();
    }

    public Optional<Perfil> getPerfilById(Long id){
        return repository.findById(id);
    }
}
