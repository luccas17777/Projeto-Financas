package com.ibm.financas.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ibm.financas.model.entities.Financas;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.swing.text.html.Option;
import java.util.Optional;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class FinancasDTO{
    @JsonProperty("id")
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


}


