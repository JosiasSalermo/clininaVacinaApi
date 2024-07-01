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
@RequestMapping("/api/fabricante")
@RequiredArgsConstructor
@CrossOrigin
public class FabricanteController {

    private final FabricanteService service;

    @GetMapping()
    public ResponseEntity get(){
        List<Fabricante> fabricantes = service.getFabricantes();
        return ResponseEntity.ok(fabricantes.stream().map(FabricanteDTO::create).collect(Collectors.toList()));
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional<Fabricante> fabricante = service.getFabricanteById(id);
        if(!fabricante.isPresent()){
            return new ResponseEntity("Fabricante não encontrado", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(fabricante.map(FabricanteDTO::create));
    }

    public Fabricante converter(FabricanteDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Fabricante fabricante = modelMapper.map(dto, Fabricante.class);
        return fabricante;
    }
}
