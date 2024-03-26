package com.example.sccvapi.service;

import com.example.sccvapi.model.entity.Cargo;
import com.example.sccvapi.model.repository.CargoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CargoService {

    private CargoRepository repository;

    public CargoService(CargoRepository repository){
        this.repository = repository;
    }

    public List<Cargo> getCargos(){
        return repository.findAll();
    }

    public Optional<Cargo> getCargoById(Long id){
        return repository.findById(id);
    }

}
