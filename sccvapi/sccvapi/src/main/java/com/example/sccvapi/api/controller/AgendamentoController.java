package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.AgendamentoDTO;
import com.example.sccvapi.model.entity.Agendamento;
import org.modelmapper.ModelMapper;

public class AgendamentoController {

    public Agendamento converter(AgendamentoDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Agendamento agendamento = modelMapper.map(dto, Agendamento.class);
        return agendamento;
    }
}
