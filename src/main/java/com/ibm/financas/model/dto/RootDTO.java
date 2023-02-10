package com.ibm.financas.model.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RootDTO{
    @JsonProperty("@odata.context")
    private String oDataContext;
    @JsonProperty(value = "value")
    private List<FinancasDTO> financasList;

}