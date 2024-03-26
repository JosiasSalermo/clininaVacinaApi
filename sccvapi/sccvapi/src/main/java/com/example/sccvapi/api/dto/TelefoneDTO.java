package com.example.sccvapi.api.dto;

import com.example.sccvapi.model.entity.Telefone;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TelefoneDTO {

    private Long id;
    private int ddd;
    private int numero;

    public static TelefoneDTO create(Telefone telefone){
        ModelMapper modelMapper = new ModelMapper();
        TelefoneDTO dto = modelMapper.map(telefone, TelefoneDTO.class);
        return dto;
    }
}
