package com.example.sccvapi.api.dto;

import com.example.sccvapi.model.entity.CondicaoEspecial;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CondicaoEspecialDTO {

    private Long id;
    private String nomeCondicao;
    private String descricao;

    public static CondicaoEspecialDTO create(CondicaoEspecial condicaoEspecial) {
        ModelMapper modelMapper = new ModelMapper();
        CondicaoEspecialDTO dto = modelMapper.map(condicaoEspecial, CondicaoEspecialDTO.class);
        return dto;
    }
}
