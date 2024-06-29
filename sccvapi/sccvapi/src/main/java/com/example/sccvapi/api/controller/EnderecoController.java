package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.*;
import com.example.sccvapi.model.entity.*;
import com.example.sccvapi.service.*;


import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/endereco")
@RequiredArgsConstructor
@CrossOrigin
public class EnderecoController {

    private final EnderecoService service;

    @GetMapping()
    public ResponseEntity get(){
        List<Endereco> enderecos = service.getEnderecos();
        return ResponseEntity.ok(enderecos.stream().map(EnderecoDTO::create).collect(Collectors.toList()));
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional<Endereco> endereco = service.getEnderecoById(id);
        if(!endereco.isPresent()){
            return new ResponseEntity("Endereco não encontrado", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(endereco.map(EnderecoDTO::create));
    }

    public Endereco converter(EnderecoDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Endereco endereco = modelMapper.map(dto, Endereco.class);
        return endereco;
    }
}
