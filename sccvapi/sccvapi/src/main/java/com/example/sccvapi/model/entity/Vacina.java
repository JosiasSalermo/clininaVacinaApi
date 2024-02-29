package com.example.sccvapi.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vacina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeVacina;
    private String tipoVacina;
    private String numeroLote;
    private Date dataValidade;
    private int dosesAmpola;
    private String indicacao;
    private String contraIndicacao;
    private Fabricante nomeFabricante;


}


