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
@RequestMapping("/api/lote")
@RequiredArgsConstructor
@CrossOrigin
public class LoteController {

    private final LoteService service;

    @GetMapping()
    public ResponseEntity get(){
        List<Lote> lotes = service.getLotes();
        return ResponseEntity.ok(lotes.stream().map(LoteDTO::create).collect(Collectors.toList()));
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional<Lote> lote = service.getLoteById(id);
        if(!lote.isPresent()){
            return new ResponseEntity("Lote não encontrado", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(lote.map(LoteDTO::create));
    }

    public Lote converter(LoteDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Lote lote = modelMapper.map(dto, Lote.class);
        return lote;
    }
}
