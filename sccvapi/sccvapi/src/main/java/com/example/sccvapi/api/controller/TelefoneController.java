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
@RequestMapping("/api/telefone")
@RequiredArgsConstructor
@CrossOrigin
public class TelefoneController {

    private final TelefoneService service;

    @GetMapping()
    public ResponseEntity get(){
        List<Telefone> telefones = service.getTelefones();
        return ResponseEntity.ok(telefones.stream().map(TelefoneDTO::create).collect(Collectors.toList()));
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional<Telefone> telefone = service.getTelefoneById(id);
        if(!telefone.isPresent()){
            return new ResponseEntity("Telefone não encontrado", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(telefone.map(TelefoneDTO::create));
    }

    public Telefone converter(TelefoneDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Telefone telefone = modelMapper.map(dto, Telefone.class);
        return telefone;
    }
}
