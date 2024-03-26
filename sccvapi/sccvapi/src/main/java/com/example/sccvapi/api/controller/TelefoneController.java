package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.TelefoneDTO;
import com.example.sccvapi.model.entity.Telefone;
import org.modelmapper.ModelMapper;

public class TelefoneController {

    public Telefone converter(TelefoneDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Telefone telefone = modelMapper.map(dto, Telefone.class);
        return telefone;
    }
}
