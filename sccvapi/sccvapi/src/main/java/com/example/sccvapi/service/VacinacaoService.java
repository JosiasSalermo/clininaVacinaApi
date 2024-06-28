package com.example.sccvapi.service;

import com.example.sccvapi.model.entity.Fabricante;
import com.example.sccvapi.model.entity.Vacina;
import com.example.sccvapi.model.entity.Vacinacao;
import com.example.sccvapi.model.repository.VacinacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VacinacaoService {

    private VacinacaoRepository repository;

    public VacinacaoService(VacinacaoRepository repository){
        this.repository = repository;
    }


    public List<Vacinacao> getVacinacoes(){
        return repository.findAll();
    }

    public Optional<Vacinacao> getVacinacaoById(Long id){
        return repository.findById(id);
    }


}
