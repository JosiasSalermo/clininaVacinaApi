package com.example.sccvapi.model.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fornecedor extends Pessoa{

    private String cnpj;
    private String razaoSocial;


}
