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
@RequestMapping("/api/fornecedor")
@RequiredArgsConstructor
@CrossOrigin
public class FornecedorController {

    private final FornecedorService service;

    @GetMapping()
    public ResponseEntity get(){
        List<Fornecedor> fornecedores = service.getFornecedores();
        return ResponseEntity.ok(fornecedores.stream().map(FornecedorDTO::create).collect(Collectors.toList()));
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional<Fornecedor> fornecedor = service.getFornecedorById(id);
        if(!fornecedor.isPresent()){
            return new ResponseEntity("Fornecedor não encontrado", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(fornecedor.map(FornecedorDTO::create));
    }

    public Fornecedor converter(FornecedorDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Fornecedor fornecedor = modelMapper.map(dto, Fornecedor.class);
        return fornecedor;
    }
}
