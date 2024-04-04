package com.example.sccvapi.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
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
    @ManyToOne
    private Fabricante fabricante;


}


