package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.FornecedorDTO;
import com.example.sccvapi.model.entity.Fornecedor;
import org.modelmapper.ModelMapper;

public class FornecedorController {

    public Fornecedor converter(FornecedorDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Fornecedor fornecedor = modelMapper.map(dto, Fornecedor.class);
        return fornecedor;
    }
}
