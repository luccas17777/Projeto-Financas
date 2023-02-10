package com.ibm.financas.model.mpastruct;

import com.ibm.financas.model.dto.FinancasDTO;
import com.ibm.financas.model.entities.Financas;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-06T15:39:29-0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19 (Oracle Corporation)"
)
@Component
public class MapstructsImpl implements Mapstructs {

    @Override
    public Financas financasDtoToFinancas(FinancasDTO financasDTO) {
        if ( financasDTO == null ) {
            return null;
        }

        Financas financas = new Financas();

        financas.setId( financasDTO.getId() );
        financas.setIndicador( financasDTO.getIndicador() );
        financas.setData( financasDTO.getData() );
        financas.setDataReferencia( financasDTO.getDataReferencia() );
        financas.setMedia( financasDTO.getMedia() );
        financas.setMediana( financasDTO.getMediana() );
        financas.setDesvioPadrao( financasDTO.getDesvioPadrao() );
        financas.setMinimo( financasDTO.getMinimo() );
        financas.setMaximo( financasDTO.getMaximo() );
        financas.setNumeroRespondentes( financasDTO.getNumeroRespondentes() );
        financas.setBaseCalculo( financasDTO.getBaseCalculo() );

        return financas;
    }

    @Override
    public FinancasDTO financasToFinancasDto(Financas financas) {
        if ( financas == null ) {
            return null;
        }

        FinancasDTO financasDTO = new FinancasDTO();

        financasDTO.setId( financas.getId() );
        financasDTO.setIndicador( financas.getIndicador() );
        financasDTO.setData( financas.getData() );
        financasDTO.setDataReferencia( financas.getDataReferencia() );
        financasDTO.setMedia( financas.getMedia() );
        financasDTO.setMediana( financas.getMediana() );
        financasDTO.setDesvioPadrao( financas.getDesvioPadrao() );
        financasDTO.setMinimo( financas.getMinimo() );
        financasDTO.setMaximo( financas.getMaximo() );
        financasDTO.setNumeroRespondentes( financas.getNumeroRespondentes() );
        financasDTO.setBaseCalculo( financas.getBaseCalculo() );

        return financasDTO;
    }
}
