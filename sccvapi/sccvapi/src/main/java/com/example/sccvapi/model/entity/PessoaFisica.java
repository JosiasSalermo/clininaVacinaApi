package com.example.sccvapi.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaFisica extends Pessoa {

    private Date dataNascimento;
    private String cpf;

}
