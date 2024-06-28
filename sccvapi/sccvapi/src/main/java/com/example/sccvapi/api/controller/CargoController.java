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
@RequestMapping("/api/cargo")
@RequiredArgsConstructor
@CrossOrigin
public class CargoController {

        private final CargoService service;

        public Cargo converter(CargoDTO dto){
            ModelMapper modelMapper = new ModelMapper();
            Cargo cargo = modelMapper.map(dto, Cargo.class);
            return cargo;
        }

        @GetMapping
        public ResponseEntity get(){
            List<Cargo> cargos = service.getCargos();
            return ResponseEntity.ok(cargos.stream().map(CargoDTO::create).collect(Collectors.toList()));
        }

        @GetMapping("/{id}")
        public ResponseEntity get(@PathVariable("id") Long id){
            Optional<Cargo> cargo = service.getCargoById(id);
            if(!cargo.isPresent()){
                return new ResponseEntity("Cargo não encontrado", HttpStatus.NOT_FOUND);
            }
            return ResponseEntity.ok(cargo.map(CargoDTO::create));
        }

}
