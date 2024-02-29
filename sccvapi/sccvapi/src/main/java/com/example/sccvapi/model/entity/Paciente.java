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
public class Paciente extends PessoaFisica{

    private String tipoSanguineo;
    private String alergia;
    private String contraIndicacao;
    private String medicamentoRegularmente;
    private String condicaoEspecial;

}
