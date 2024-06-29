package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.CondicaoEspecialDTO;
import com.example.sccvapi.model.entity.CondicaoEspecial;
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
@RequestMapping("/api/condicaoEspecial")
@RequiredArgsConstructor
@CrossOrigin
public class CondicaoEspecialController {

    private final CondicaoEspecialService service;

    @GetMapping()
    public ResponseEntity get(){
        List<CondicaoEspecial> condicoesEspeciais = service.getCondicoesEspeciais();
        return ResponseEntity.ok(condicoesEspeciais.stream().map(CondicaoEspecialDTO::create).collect(Collectors.toList()));
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional<CondicaoEspecial> condicaoEspecial = service.getCondicaoEspecialById(id);
        if(!condicaoEspecial.isPresent()){
            return new ResponseEntity("Condição Especial não encontrada", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(condicaoEspecial.map(CondicaoEspecialDTO::create));
    }

    public CondicaoEspecial converter(CondicaoEspecialDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        CondicaoEspecial condicaoEspecial = modelMapper.map(dto, CondicaoEspecial.class);
        return condicaoEspecial;
    }
}
