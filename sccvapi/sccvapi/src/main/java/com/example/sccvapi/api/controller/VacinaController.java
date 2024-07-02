package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.VacinaDTO;
import com.example.sccvapi.model.entity.Fabricante;
import com.example.sccvapi.model.entity.Vacina;
import com.example.sccvapi.service.FabricanteService;
import com.example.sccvapi.service.VacinaService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api/vacina")
@RequiredArgsConstructor
@CrossOrigin
public class VacinaController {

    private final VacinaService service;
    private final FabricanteService fabricanteService;

    @GetMapping()
    public ResponseEntity get(){
        List<Vacina> vacinas = service.getVacinas();
        return ResponseEntity.ok(vacinas.stream().map(VacinaDTO::create).collect(Collectors.toList()));
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional<Vacina> vacina = service.getVacinaById(id);
        if(!vacina.isPresent()){
            return new ResponseEntity("Vacina não encontrada", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(vacina.map(VacinaDTO::create));
    }

    public Vacina converter(VacinaDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Vacina vacina = modelMapper.map(dto, Vacina.class);
        //Fabricante fabricante = modelMapper.mp(dto, Vacina.class);
        //vacina.setFabricante(fabricante);
        if(dto.getIdFabricante() != null){
            Optional<Fabricante> fabricante = fabricanteService.getFabricanteById(dto.getIdFabricante());
            if(!fabricante.isPresent()){
                vacina.setFabricante(null);
            } else{
                vacina.setFabricante(fabricante.get());
            }
        }
        return vacina;

    }
}
