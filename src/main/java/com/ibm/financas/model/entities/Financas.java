package com.ibm.financas.model.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "financas")
public class Financas{
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
}


