package com.example.sccvapi.service;

import com.example.sccvapi.model.entity.PessoaFisica;
import com.example.sccvapi.model.repository.PessoaFisicaRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Date;
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

    @PostConstruct
    public void insertTestData(){
        PessoaFisica pessoaFisica = new PessoaFisica();
        Date dataNascimento;
        String cpf;
        repository.save(pessoaFisica);

    }
}
