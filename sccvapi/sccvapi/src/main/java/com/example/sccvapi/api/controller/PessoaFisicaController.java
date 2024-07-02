package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.PessoaFisicaDTO;
import com.example.sccvapi.model.entity.PessoaFisica;
import com.example.sccvapi.service.PessoaFisicaService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/api/pessoaFisica")
@RequiredArgsConstructor
@CrossOrigin
public class PessoaFisicaController {

    private final PessoaFisicaService service;

    @GetMapping()
    public ResponseEntity get(){
        List<PessoaFisica> pessoasFisicas = service.getPessoasFisicas();
        return ResponseEntity.ok(pessoasFisicas.stream().map(PessoaFisicaDTO::create).collect(Collectors.toList()));
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional<PessoaFisica> pessoaFisica = service.getPessoaFisicaById(id);
        if(!pessoaFisica.isPresent()){
            return new ResponseEntity("Pessoa Física não encontrada", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(pessoaFisica.map(PessoaFisicaDTO::create));
    }

    public PessoaFisica converter(PessoaFisicaDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        PessoaFisica pessoaFisica = modelMapper.map(dto, PessoaFisica.class);
        return pessoaFisica;
    }


}
