package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.VacinaDTO;
import com.example.sccvapi.model.entity.Fabricante;
import com.example.sccvapi.model.entity.Vacina;
import com.example.sccvapi.service.FabricanteService;
import com.example.sccvapi.service.VacinaService;
import org.modelmapper.ModelMapper;

import java.util.Optional;

public class VacinaController {

    private final VacinaService service;
    private final FabricanteService fabricante;

    public Vacina converter(VacinaDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Vacina vacina = modelMapper.map(dto, Vacina.class);
        Fabricante fabricante = modelMapper.mp(dto, Vacina.class);
        vacina.setFabricante(fabricante);
        if(dto. getIdFabricante() != null){
            Optional<Fabricante> fabricante = fabricanteServide.getCursoById(dto, getIdFabricante());
            if(!fabricante.isPresent()){
                vacina.setFabricante(null);
            } else{
                vacina.setVacina(vacina.ger());
            }
        }
        return vacina;

    }
}
