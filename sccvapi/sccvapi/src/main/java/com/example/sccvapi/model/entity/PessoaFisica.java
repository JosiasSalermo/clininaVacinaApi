package com.example.sccvapi.model.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaFisica extends Pessoa {

    private Date dataNascimento;
    private String cpf;
}
