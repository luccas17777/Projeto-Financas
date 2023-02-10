package com.ibm.financas.model.service;

import com.ibm.financas.model.dto.FinancasDTO;
import com.ibm.financas.model.dto.RootDTO;
import com.ibm.financas.model.entities.Financas;
import com.ibm.financas.model.exception.ExceptionConfig;
import com.ibm.financas.model.mpastruct.Mapstructs;
import com.ibm.financas.model.repositories.ClientFeign;
import com.ibm.financas.model.repositories.RepositoryFinancas;
import com.ibm.financas.model.response.Response;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FinancasService {

    @Autowired
    private RepositoryFinancas rep;

    @Autowired
    private ClientFeign clientFeign;

    @Autowired
    private Mapstructs mapstructs;

    public void saveAllFinancas(){
        RootDTO dadosDto = clientFeign.getAllFinancas();

        for (FinancasDTO obj:
                dadosDto.getFinancasList()) {
            rep.save(mapstructs.financasDtoToFinancas(obj));
        }
    }

    public Response getById(Long id){
        Financas financas = rep.findById(id).orElse(null);
        FinancasDTO retornoDto = mapstructs.financasToFinancasDto(financas);

        return Response.createWaitDTO(retornoDto);
    }

    public List<Response> getDataBank(Pageable pageable){
        return rep.findAll(pageable).stream().map(financas -> Response.createWaitEntity(financas)).collect(Collectors.toList());
    }

    public List<Response> getDataReference(String dataReference){
        List<Financas> retornoEntity = rep.findAllDataReferencies(dataReference);
        List<FinancasDTO> retornoConvertidoToDto = retornoEntity.stream().map(mapstructs::financasToFinancasDto).collect(Collectors.toList());
        return retornoConvertidoToDto.stream().map(Response::createWaitDTO).collect(Collectors.toList());
    }

    public void saveFinancas(Iterable<Financas> financas){
        rep.saveAll(financas);
    }

    public void updateFinancas(Financas financas, Long id){
        Financas retorno = rep.findById(id).orElse(null);

        retorno.setData(financas.getData());
        retorno.setIndicador(financas.getIndicador());
        retorno.setMaximo(financas.getMaximo());
        retorno.setMedia(financas.getMedia());
        retorno.setBaseCalculo(financas.getBaseCalculo());
        retorno.setDataReferencia(financas.getDataReferencia());
        retorno.setDesvioPadrao(financas.getDesvioPadrao());
        retorno.setMinimo(financas.getMinimo());
        retorno.setNumeroRespondentes(financas.getNumeroRespondentes());

        rep.save(retorno);
    }

    public void deleteFinancas(Long id){
        rep.deleteById(id);
    }


}
