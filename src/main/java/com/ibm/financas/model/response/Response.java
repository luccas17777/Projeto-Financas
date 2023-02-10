package com.ibm.financas.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.financas.model.dto.FinancasDTO;
import com.ibm.financas.model.entities.Financas;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Collections;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @JsonProperty("Indicador")
    private String indicador;
    @JsonProperty("Data")
    private String data;
    @JsonProperty("DataReferencia")
    @Column(name = "data_referencia")
    private String dataReferencia;
    @JsonProperty("Media")
    private double media;
    @JsonProperty("Mediana")
    private double mediana;
    @JsonProperty("DesvioPadrao")
    private double desvioPadrao;
    @JsonProperty("Minimo")
    private double minimo;
    @JsonProperty("Maximo")
    private double maximo;
    private int numeroRespondentes;
    private int baseCalculo;

    public static Response createWaitEntity(Financas financas){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(financas, Response.class);
    }

    public static Response createWaitDTO(FinancasDTO financasDTO){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(financasDTO, Response.class);
    }

}
