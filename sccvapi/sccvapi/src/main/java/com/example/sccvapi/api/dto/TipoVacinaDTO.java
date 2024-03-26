package com.example.sccvapi.api.dto;

import com.example.sccvapi.model.entity.TipoVacina;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoVacinaDTO {

    private Long id;
    private String tipo;
    private String descricao;

    public static TipoVacinaDTO create(TipoVacina tipoVacina){
        ModelMapper modelMapper = new ModelMapper();
        TipoVacinaDTO dto = modelMapper.map(tipoVacina, TipoVacinaDTO.class);
        return dto;
    }
}
