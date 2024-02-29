package com.example.sccvapi.model.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Fornecedor extends Pessoa{

    private String cnpj;
    private String razaoSocial;


}