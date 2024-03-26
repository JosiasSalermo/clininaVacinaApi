package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.CargoDTO;
import com.example.sccvapi.model.entity.Cargo;
import org.modelmapper.ModelMapper;

public class CargoController {

        public Cargo converter(CargoDTO dto){
            ModelMapper modelMapper = new ModelMapper();
            Cargo cargo = modelMapper.map(dto, Cargo.class);
            return cargo;
        }
}
