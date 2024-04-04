package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.VacinaDTO;
import com.example.sccvapi.model.entity.Fabricante;
import com.example.sccvapi.model.entity.Vacina;
import com.example.sccvapi.service.FabricanteService;
import com.example.sccvapi.service.VacinaService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RestController
@RequestMapping("/api/vacina")
@RequiredArgsConstructor
@CrossOrigin
public class VacinaController {

    private final VacinaService service;
    private final FabricanteService fabricanteService;

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
