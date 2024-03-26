package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.FuncionarioDTO;
import com.example.sccvapi.model.entity.Funcionario;
import org.modelmapper.ModelMapper;

public class FuncionarioController {

    public Funcionario converter(FuncionarioDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Funcionario funcionario = modelMapper.map(dto, Funcionario.class);
        return funcionario;
    }
}
