package com.example.sccvapi.service;

import com.example.sccvapi.model.entity.Vacina;
import com.example.sccvapi.model.repository.VacinaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VacinaService {

    private VacinaRepository repository;

    public VacinaService(VacinaRepository repository){
        this.repository = repository;
    }

    public List<Vacina> getVacinas(){
        return repository.findAll();
    }

    public Optional<Vacina> getVacinaById(Long id){
        return repository.findById(id);
    }

}
