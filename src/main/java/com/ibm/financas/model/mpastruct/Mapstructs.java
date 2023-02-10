package com.ibm.financas.model.mpastruct;

import com.ibm.financas.model.dto.FinancasDTO;
import com.ibm.financas.model.entities.Financas;
import com.ibm.financas.model.response.Response;
import org.mapstruct.Mapper;
import org.springframework.data.domain.Page;

import java.util.List;


@Mapper(componentModel = "spring")
public interface Mapstructs {

    Financas financasDtoToFinancas(FinancasDTO financasDTO);

    FinancasDTO financasToFinancasDto(Financas financas);



}
