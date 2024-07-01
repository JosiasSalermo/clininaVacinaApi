package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.*;
import com.example.sccvapi.model.entity.*;
import com.example.sccvapi.service.*;

import com.example.sccvapi.exception.RegraNegocioException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/paciente")
@RequiredArgsConstructor
@CrossOrigin
public class PacienteController {

    private final PacienteService service;

    @GetMapping()
    public ResponseEntity get(){
        List<Paciente> pacientes = service.getPacientes();
        return ResponseEntity.ok(pacientes.stream().map(PacienteDTO::create).collect(Collectors.toList()));
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional<Paciente> paciente = service.getPacienteById(id);
        if(!paciente.isPresent()){
            return new ResponseEntity("Paciente não encontrado", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(paciente.map(PacienteDTO::create));
    }

    public Paciente converter(PacienteDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Paciente paciente = modelMapper.map(dto, Paciente.class);
        return paciente;
    }
}
