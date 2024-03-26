package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.FabricanteDTO;
import com.example.sccvapi.model.entity.Fabricante;
import org.modelmapper.ModelMapper;

public class FabricanteController {

    public Fabricante converter(FabricanteDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Fabricante fabricante = modelMapper.map(dto, Fabricante.class);
        return fabricante;
    }
}
