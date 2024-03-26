package com.example.sccvapi.service;

import com.example.sccvapi.model.entity.Fornecedor;
import com.example.sccvapi.model.repository.FornecedorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {

    private FornecedorRepository repository;

    public FornecedorService(FornecedorRepository repository){
        this.repository = repository;
    }

    public List<Fornecedor> getFornecedores(){
        return repository.findAll();
    }

    public Optional<Fornecedor> getFornecedorById(Long id) {
        return repository.findById(id);
    }
}
