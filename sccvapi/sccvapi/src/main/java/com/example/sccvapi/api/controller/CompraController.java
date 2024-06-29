package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.*;
import com.example.sccvapi.model.entity.*;
import com.example.sccvapi.service.*;


import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/compra")
@RequiredArgsConstructor
@CrossOrigin
public class CompraController {

    private final CompraService service;

    @GetMapping()
    public ResponseEntity get(){
        List<Compra> compras = service.getCompras();
        return ResponseEntity.ok(compras.stream().map(CompraDTO::create).collect(Collectors.toList()));
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional<Compra> compra = service.getCompraById(id);
        if(!compra.isPresent()){
            return new ResponseEntity("Compra não encontrada", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(compra.map(CompraDTO::create));
    }

    public Compra converter(CompraDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Compra compra = modelMapper.map(dto, Compra.class);
        return compra;
    }
}
