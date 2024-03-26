package com.example.sccvapi.api.dto;

import com.example.sccvapi.model.entity.Fornecedor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FornecedorDTO {

    private String cnpj;
    private String razaoSocial;

    public static FornecedorDTO create(Fornecedor fornecedor){
        ModelMapper modelMapper = new ModelMapper();
        FornecedorDTO dto = modelMapper.map(fornecedor, FornecedorDTO.class);
        return dto;
    }
}
