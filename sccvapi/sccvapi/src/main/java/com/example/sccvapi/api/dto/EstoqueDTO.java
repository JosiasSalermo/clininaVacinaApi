package com.example.sccvapi.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstoqueDTO {

    private Long id;
    private int quantidade;
    private int quantidadeMaxima;
    private int pontoRessuprimento;
    private String nomeVacina;


    public static EstoqueDTO create(EstoqueDTO estoque) {
        ModelMapper modelMapper = new ModelMapper();
        EstoqueDTO dto = modelMapper.map(estoque, EstoqueDTO.class);
        return dto;
    }
}
