package com.example.sccvapi.service;

import com.example.sccvapi.model.entity.Agendamento;
import com.example.sccvapi.model.repository.AgendamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendamentoService {

    private AgendamentoRepository repository;

    public AgendamentoService(AgendamentoRepository repository){
        this.repository = repository;
    }

    public List<Agendamento> getAgendamentos(){
        return repository.findAll();
    }

    public Optional<Agendamento> getAgendamentoById(Long id){
        return repository.findById(id);
    }
}
