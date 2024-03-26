package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.PacienteDTO;
import com.example.sccvapi.model.entity.Paciente;
import org.modelmapper.ModelMapper;

public class PacienteController {

    public Paciente converter(PacienteDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Paciente paciente = modelMapper.map(dto, Paciente.class);
        return paciente;
    }
}
