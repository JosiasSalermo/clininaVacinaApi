package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.PerfilDTO;
import com.example.sccvapi.model.entity.Perfil;
import org.modelmapper.ModelMapper;

public class PerfilController {

    public Perfil converter(PerfilDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Perfil perfil = modelMapper.map(dto, Perfil.class);
        return perfil;
    }
}
