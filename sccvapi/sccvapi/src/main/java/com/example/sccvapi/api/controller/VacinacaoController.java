package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.VacinacaoDTO;
import com.example.sccvapi.model.entity.Vacinacao;
import org.modelmapper.ModelMapper;

public class VacinacaoController {

    public Vacinacao converter(VacinacaoDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Vacinacao vacinacao = modelMapper.map(dto, Vacinacao.class);
        return vacinacao;
    }
}
