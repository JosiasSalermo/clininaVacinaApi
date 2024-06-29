package com.example.sccvapi.api.dto;

import com.example.sccvapi.model.entity.Compra;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompraDTO {
    private Long id;
    private Date dataCompra;
    private double valor;

    public static CompraDTO create(Compra compra) {
        ModelMapper modelMapper = new ModelMapper();
        CompraDTO dto = modelMapper.map(compra, CompraDTO.class);
        return dto;
    }
}
