package com.example.sccvapi.api.dto;

import com.example.sccvapi.model.entity.PessoaFisica;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaFisicaDTO {

    private Date dataNascimento;
    private String cpf;

    public static PessoaFisicaDTO create(PessoaFisica pessoaFisica){
        ModelMapper modelMapper = new ModelMapper();
        PessoaFisicaDTO dto = modelMapper.map(pessoaFisica, PessoaFisicaDTO.class);
        return dto;
    }
}
