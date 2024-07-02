package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.TipoVacinaDTO;
import com.example.sccvapi.model.entity.TipoVacina;
import com.example.sccvapi.service.TipoVacinaService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/tipo-vacina")
@RequiredArgsConstructor
@CrossOrigin
public class TipoVacinaController {

    private final TipoVacinaService service;

    @GetMapping()
    public ResponseEntity get(){
        List<TipoVacina> tipoVacinas = service.getTipoVacinas();
        return ResponseEntity.ok(tipoVacinas.stream().map(TipoVacinaDTO::create).collect(Collectors.toList()));
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional<TipoVacina> tipoVacina = service.getTipoVacinaById(id);
        if(!tipoVacina.isPresent()){
       return new ResponseEntity("Tipo de vacina não encontrado", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(tipoVacina.map(TipoVacinaDTO::create));
    }

    public TipoVacina converter(TipoVacinaDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        TipoVacina tipoVacina = modelMapper.map(dto, TipoVacina.class);
        return tipoVacina;
    }
}
