package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.LoteDTO;
import com.example.sccvapi.model.entity.Lote;
import org.modelmapper.ModelMapper;

public class LoteController {

    public Lote converter(LoteDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Lote lote = modelMapper.map(dto, Lote.class);
        return lote;
    }
}
