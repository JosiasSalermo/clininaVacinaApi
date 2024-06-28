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
@RequestMapping("/api/agendamento")
@RequiredArgsConstructor
@CrossOrigin
public class AgendamentoController {

    private final AgendamentoService service;
    private final VacinaService vacinaService;

    @GetMapping()
    public ResponseEntity get(){
        List<Agendamento> agendamentos = service.getAgendamentos();
        return ResponseEntity.ok(agendamentos.stream().map(AgendamentoDTO::create).collect(Collectors.toList()));
    }

    @GetMapping("/{id}")
    public ResponseEntity get(@PathVariable("id") Long id){
        Optional<Agendamento> agendamento = service.getAgendamentoById(id);
        if(!agendamento.isPresent()){
            return new ResponseEntity("Agendamento não encontrado", HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(agendamento.map(AgendamentoDTO::create));
    }



    public Agendamento converter(AgendamentoDTO dto){
        ModelMapper modelMapper = new ModelMapper();
        Agendamento agendamento = modelMapper.map(dto, Agendamento.class);
        //Vacina vacina = modelMapper.map(dto, Vacina.class);
        //agendamento.setVacina(vacina);
        if(dto.getIdVacina() != null){
            Optional<Vacina> vacina = vacinaService.getVacinaById(dto.getIdVacina());
            if (!vacina.isPresent()){
                agendamento.setVacina(null);
            }else{
                agendamento.setVacina(vacina.get());
            }
        }
        return agendamento;
    }

}
