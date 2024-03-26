package com.example.sccvapi.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PerfilDTO {

    private Long id;
    private String perfil;
    private String acessos;

    public static PerfilDTO create(PerfilDTO perfil){
        ModelMapper modelMapper = new ModelMapper();
        PerfilDTO dto = modelMapper.map(perfil, PerfilDTO.class);
        return dto;
    }
}
