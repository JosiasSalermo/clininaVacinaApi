package com.example.sccvapi.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario extends PessoaFisica{

    private String cargo;
    private String especialidade;
    private int registroConselho;
    private String acessos;




}
