package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.TipoVacinaDTO;
import com.example.sccvapi.model.entity.TipoVacina;
import org.modelmapper.ModelMapper;

public class TipoVacinaController {

    public TipoVacina converter(TipoVacinaDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        TipoVacina tipoVacina = modelMapper.map(dto, TipoVacina.class);
        return tipoVacina;
    }
}
