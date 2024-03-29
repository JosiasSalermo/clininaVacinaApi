package com.example.sccvapi.service;

import com.example.sccvapi.model.entity.Endereco;
import com.example.sccvapi.model.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    private EnderecoRepository repository;

    public EnderecoService(EnderecoRepository repository){
        this.repository = repository;
    }

    public List<Endereco> getEnderecos(){
        return repository.findAll();
    }

    public Optional<Endereco> getEnderecoById(Long id){
        return repository.findById(id);
    }
}
