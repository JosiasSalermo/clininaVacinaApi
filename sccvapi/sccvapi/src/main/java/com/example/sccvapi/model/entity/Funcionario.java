package com.example.sccvapi.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
