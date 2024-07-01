package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.*;
import com.example.sccvapi.model.entity.*;
import com.example.sccvapi.service.*;

import com.example.sccvapi.exception.RegraNegocioException;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/pessoa")
@RequiredArgsConstructor
@CrossOrigin
public class PessoaController {

    private final PessoaService service;

    public Pessoa converter(PessoaDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Pessoa pessoa = modelMapper.map(dto, Pessoa.class);
        return pessoa;
    }
}
