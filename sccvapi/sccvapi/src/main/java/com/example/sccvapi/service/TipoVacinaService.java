package com.example.sccvapi.service;

import com.example.sccvapi.model.entity.TipoVacina;
import com.example.sccvapi.model.repository.TipoVacinaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoVacinaService {

    private TipoVacinaRepository repository;

    public TipoVacinaService(TipoVacinaRepository repository){
        this.repository = repository;
    }

    public List<com.example.sccvapi.model.entity.TipoVacina> getTipoVacinas(){
        return repository.findAll();
    }

    public Optional<TipoVacina> getTipoVacinaById(Long id){
        return repository.findById(id);
    }

}
