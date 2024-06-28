package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.PessoaFisicaDTO;
import com.example.sccvapi.model.entity.PessoaFisica;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

public class PessoaFisicaController {

    public PessoaFisica converter(PessoaFisicaDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        PessoaFisica pessoaFisica = modelMapper.map(dto, PessoaFisica.class);
        return pessoaFisica;
    }


}
