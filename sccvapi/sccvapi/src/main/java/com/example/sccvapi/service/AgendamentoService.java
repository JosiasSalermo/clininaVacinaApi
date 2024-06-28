package com.example.sccvapi.service;

import com.example.sccvapi.exception.RegraNegocioException;
import com.example.sccvapi.model.entity.*;
import com.example.sccvapi.model.repository.AgendamentoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Objects;
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
    
    @Transactional
    public Agendamento salvar(Agendamento agendamento){
        validar(agendamento);
        return repository.save(agendamento);
    }

    public void validar(Agendamento agendamento){

       if(agendamento.getDataAgendamento() == null ){
           throw new RegraNegocioException("Data inválida");
       }

       if(agendamento.getHorarioAgendamento() == null ) {
              throw new RegraNegocioException("Horário inválido");
       }
    }
}
