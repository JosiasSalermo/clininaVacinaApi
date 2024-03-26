package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.PessoaFisicaDTO;
import com.example.sccvapi.model.entity.PessoaFisica;
import org.modelmapper.ModelMapper;

public class PessoaFisicaController {

    public PessoaFisica converter(PessoaFisicaDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        PessoaFisica pessoaFisica = modelMapper.map(dto, PessoaFisica.class);
        return pessoaFisica;
    }
}
