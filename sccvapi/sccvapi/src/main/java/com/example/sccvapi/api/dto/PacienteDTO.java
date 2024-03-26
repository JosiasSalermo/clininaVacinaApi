package com.example.sccvapi.api.dto;

import com.example.sccvapi.model.entity.Paciente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PacienteDTO {

    private String tipoSanguineo;
    private String alergia;
    private String contraIndicacao;
    private String medicamentoRegularmente;
    private String condicaoEspecial;

    public static PacienteDTO create(Paciente paciente){
        ModelMapper modelMapper = new ModelMapper();
        PacienteDTO dto = modelMapper .map(paciente, PacienteDTO.class);
        return dto;
    }


}
