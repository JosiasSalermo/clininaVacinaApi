package com.example.sccvapi.api.dto;

import com.example.sccvapi.model.entity.Lote;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoteDTO {

    private Date dataValidade;
    private String numeroLote;
    private String numeroAmpola;
    private int desesAmpola;

    public static LoteDTO create(Lote lote) {
        ModelMapper modelMapper = new ModelMapper();
        LoteDTO dto = modelMapper.map(lote, LoteDTO.class);
        return dto;
    }


}
