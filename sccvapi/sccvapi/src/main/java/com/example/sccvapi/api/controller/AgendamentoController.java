package com.example.sccvapi.api.controller;

import com.example.sccvapi.api.dto.AgendamentoDTO;
import com.example.sccvapi.model.entity.Agendamento;
import com.example.sccvapi.model.entity.Vacina;
import com.example.sccvapi.service.AgendamentoService;
import com.example.sccvapi.service.VacinaService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/agendamento")
@RequiredArgsConstructor
@CrossOrigin
public class AgendamentoController {

    private final AgendamentoService service;
    private final VacinaService vacinaService;



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
