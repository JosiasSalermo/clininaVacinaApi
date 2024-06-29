package com.example.sccvapi.api.dto;

import com.example.sccvapi.model.entity.Endereco;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoDTO {

    private Long id;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;
    private int cep;

    public static EnderecoDTO create(Endereco endereco) {
        ModelMapper modelMapper = new ModelMapper();
        EnderecoDTO dto = modelMapper.map(endereco, EnderecoDTO.class);
        return dto;
    }
}
