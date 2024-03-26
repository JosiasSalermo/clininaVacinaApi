package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.CompraDTO;
import com.example.sccvapi.model.entity.Compra;
import org.modelmapper.ModelMapper;

public class CompraController {

    public Compra converter(CompraDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Compra compra = modelMapper.map(dto, Compra.class);
        return compra;
    }
}
