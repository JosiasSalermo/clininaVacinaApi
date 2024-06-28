package com.example.sccvapi.service;

import com.example.sccvapi.model.entity.Compra;
import com.example.sccvapi.model.repository.CompraRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompraService {

    private CompraRepository repository;

    public CompraService(CompraRepository repository){
            this.repository = repository;
        }

    public List<Compra> getCompras(){
            return repository.findAll();
        }

    public Optional<Compra> getCompraById(Long id){
            return repository.findById(id);
        }
}
