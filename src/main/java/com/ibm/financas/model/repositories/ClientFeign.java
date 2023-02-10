package com.ibm.financas.model.repositories;


import com.ibm.financas.model.dto.RootDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient (name = "financas", url = "https://olinda.bcb.gov.br/olinda/servico/Expectativas/versao/v1/odata/ExpectativaMercadoMensais?$top=100&$format=json")
public interface ClientFeign {

    @GetMapping
    RootDTO getAllFinancas();

}