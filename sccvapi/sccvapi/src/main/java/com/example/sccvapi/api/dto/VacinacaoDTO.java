package com.example.sccvapi.api.dto;

import com.example.sccvapi.model.entity.Vacinacao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VacinacaoDTO {

    private Long id;
    private Date dataAplicacao;

    public static VacinacaoDTO create(Vacinacao vacinacao){
        ModelMapper modelMapper = new ModelMapper();
        VacinacaoDTO dto = modelMapper.map(vacinacao, VacinacaoDTO.class);
        return dto;
    }

}
