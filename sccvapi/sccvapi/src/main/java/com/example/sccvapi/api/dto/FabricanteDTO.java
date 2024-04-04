package com.example.sccvapi.api.dto;

import com.example.sccvapi.model.entity.Fabricante;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FabricanteDTO {

    private Long id;
    private String nomeFabricante;

    public static FabricanteDTO create(Fabricante fabricante) {
        ModelMapper modelMapper = new ModelMapper();
        FabricanteDTO dto = modelMapper.map(fabricante, FabricanteDTO.class);
        return dto;
    }
}
