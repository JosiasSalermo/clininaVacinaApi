package com.example.sccvapi.model.entity;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

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
