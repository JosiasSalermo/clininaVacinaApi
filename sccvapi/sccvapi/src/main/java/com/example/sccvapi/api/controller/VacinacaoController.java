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
@RequestMapping("/api/vacinacao")
@RequiredArgsConstructor
@CrossOrigin
public class VacinacaoController {

    private final VacinacaoService service;

    @GetMapping()
    public ResponseEntity get(){
        List<Vacinacao> vacinacoes = service.getVacinacoes();
        return ResponseEntity.ok(vacinacoes.stream().map(VacinacaoDTO::create).collect(Collectors.toList()));
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional<Vacinacao> vacinacao = service.getVacinacaoById(id);
        if(!vacinacao.isPresent()){
            return new ResponseEntity("Vacinacao não encontrada", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(vacinacao.map(VacinacaoDTO::create));
    }

    public Vacinacao converter(VacinacaoDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Vacinacao vacinacao = modelMapper.map(dto, Vacinacao.class);
        return vacinacao;
    }
}
