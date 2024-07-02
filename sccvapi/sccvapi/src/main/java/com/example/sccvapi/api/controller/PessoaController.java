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
@RequestMapping("/api/pessoa")
@RequiredArgsConstructor
@CrossOrigin
public class PessoaController {

    private final PessoaService service;

    @GetMapping()
    public ResponseEntity get(){
        List<Pessoa> pessoas = service.getPessoas();
        return ResponseEntity.ok(pessoas.stream().map(PessoaDTO::create).collect(Collectors.toList()));
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional<Pessoa> pessoa = service.getPessoaById(id);
        if(!pessoa.isPresent()){
            return new ResponseEntity("Pessoa não encontrada", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(pessoa.map(PessoaDTO::create));
    }

    public Pessoa converter(PessoaDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Pessoa pessoa = modelMapper.map(dto, Pessoa.class);
        return pessoa;
    }
}
