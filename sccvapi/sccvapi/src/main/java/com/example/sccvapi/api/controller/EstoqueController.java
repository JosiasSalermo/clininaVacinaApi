package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.EstoqueDTO;
import com.example.sccvapi.model.entity.Estoque;
import org.modelmapper.ModelMapper;

public class EstoqueController {

    public Estoque converter(EstoqueDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Estoque estoque = modelMapper.map(dto, Estoque.class);
        return estoque;
    }
}
