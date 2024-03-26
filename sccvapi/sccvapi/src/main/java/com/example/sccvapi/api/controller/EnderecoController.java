package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.EnderecoDTO;
import com.example.sccvapi.model.entity.Endereco;
import org.modelmapper.ModelMapper;

public class EnderecoController {

    public Endereco converter(EnderecoDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Endereco endereco = modelMapper.map(dto, Endereco.class);
        return endereco;
    }
}
