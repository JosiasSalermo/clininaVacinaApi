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
@RequestMapping("/api/perfil")
@RequiredArgsConstructor
@CrossOrigin
public class PerfilController {

    private final PerfilService service;

    @GetMapping()
    public ResponseEntity get(){
        List<Perfil> perfis = service.getPerfis();
        return ResponseEntity.ok(perfis.stream().map(PerfilDTO::create).collect(Collectors.toList()));
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional<Perfil> perfil = service.getPerfilById(id);
        if(!perfil.isPresent()){
            return new ResponseEntity("Perfil não encontrado", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(perfil.map(PerfilDTO::create));
    }

    public Perfil converter(PerfilDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Perfil perfil = modelMapper.map(dto, Perfil.class);
        return perfil;
    }
}
