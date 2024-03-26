package com.example.sccvapi.api.dto;

import com.example.sccvapi.model.entity.Endereco;
import com.example.sccvapi.model.entity.Pessoa;
import com.example.sccvapi.model.entity.Telefone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDTO {

    private Long id;
    private String nome;
    private String email;
    private Telefone telefone;
    private Endereco endereco;

    public static PessoaDTO create(Pessoa pessoa){
        ModelMapper modelMapper = new ModelMapper();
        PessoaDTO dto = modelMapper.map(pessoa, PessoaDTO.class);
        dto.telefone = pessoa.getTelefone();
        dto.endereco = pessoa.getEndereco();
        return dto;
    }

}
