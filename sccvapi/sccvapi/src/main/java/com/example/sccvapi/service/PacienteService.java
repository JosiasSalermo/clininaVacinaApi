package com.example.sccvapi.service;

import com.example.sccvapi.model.entity.Paciente;
import com.example.sccvapi.model.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    private PacienteRepository repository;

    public PacienteService(PacienteRepository repository){
        this.repository = repository;
    }

    public List<Paciente> getPacientes(){
        return repository.findAll();
    }

    public Optional<Paciente> getPacienteById(Long id){
        return repository.findById(id);
    }
}
