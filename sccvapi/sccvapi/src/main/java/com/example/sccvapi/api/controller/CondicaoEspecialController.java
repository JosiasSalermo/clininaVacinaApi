package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.CondicaoEspecialDTO;
import com.example.sccvapi.model.entity.CondicaoEspecial;
import org.modelmapper.ModelMapper;

public class CondicaoEspecialController {

    public CondicaoEspecial converter(CondicaoEspecialDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        CondicaoEspecial condicaoEspecial = modelMapper.map(dto, CondicaoEspecial.class);
        return condicaoEspecial;
    }
}
