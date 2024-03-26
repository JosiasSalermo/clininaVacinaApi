package com.example.sccvapi.service;

import com.example.sccvapi.model.entity.PessoaFisica;
import com.example.sccvapi.model.repository.PessoaFisicaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaFisicaService {

    private PessoaFisicaRepository repository;

    public PessoaFisicaService(PessoaFisicaRepository repository){
        this.repository = repository;
    }

    public List<PessoaFisica> getPessoasFisicas(){
        return repository.findAll();
    }

    public Optional<PessoaFisica> getPessoaFisicaById(Long id){
        return repository.findById(id);
    }
}
