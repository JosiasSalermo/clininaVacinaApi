package com.example.sccvapi.api.dto;

import com.example.sccvapi.model.entity.Fabricante;
import com.example.sccvapi.model.entity.Vacina;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VacinaDTO {

    private Long id;
    private Long idFabricante;
    private String nomeVacina;
    private String tipoVacina;
    private String numeroLote;
    private Date dataValidade;
    private int dosesAmpola;
    private String indicacao;
    private String contraIndicacao;
    private Fabricante nomeFabricante;

    public static VacinaDTO create(Vacina vacina){
        ModelMapper modelMapper = new ModelMapper();
        VacinaDTO dto = modelMapper.map(vacina, VacinaDTO.class);
        return dto;
    }
}
