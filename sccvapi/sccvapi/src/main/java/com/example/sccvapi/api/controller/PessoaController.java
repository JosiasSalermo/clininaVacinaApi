package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.PessoaDTO;
import com.example.sccvapi.model.entity.Pessoa;
import org.modelmapper.ModelMapper;

public class PessoaController {

    public Pessoa converter(PessoaDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Pessoa pessoa = modelMapper.map(dto, Pessoa.class);
        return pessoa;
    }
}
