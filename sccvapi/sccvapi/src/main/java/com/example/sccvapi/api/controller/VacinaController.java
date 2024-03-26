package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.VacinaDTO;
import com.example.sccvapi.model.entity.Vacina;
import org.modelmapper.ModelMapper;

public class VacinaController {

    public Vacina converter(VacinaDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Vacina vacina = modelMapper.map(dto, Vacina.class);
        return vacina;
    }
}
