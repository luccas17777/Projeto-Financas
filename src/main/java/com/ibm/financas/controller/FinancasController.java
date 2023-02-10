package com.ibm.financas.controller;

import com.ibm.financas.model.dto.RootDTO;
import com.ibm.financas.model.entities.Financas;
import com.ibm.financas.model.repositories.ClientFeign;
import com.ibm.financas.model.response.Response;
import com.ibm.financas.model.service.FinancasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/financas")
public class FinancasController {

    @Autowired
    private ClientFeign clientFeign;

    @Autowired
    private FinancasService service;

    // METODOS GET *********************************************************************************
    @GetMapping
    public RootDTO getAllFinancas(){
        return clientFeign.getAllFinancas();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity getById(@PathVariable("id") Long id){
        return ResponseEntity.ok(service.getById(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity getAllData(@RequestParam(value = "page", defaultValue = "0") Integer page,
                                     @RequestParam(value = "size", defaultValue = "10") Integer size){
        return ResponseEntity.ok(service.getDataBank(PageRequest.of(page, size)));
    }

    @GetMapping("/dataReferencia")
    public ResponseEntity getDataReferencia(@RequestParam("dataReferencia") String dataReferencia){
        return ResponseEntity.ok(service.getDataReference(dataReferencia));
    }

    // METODOS POST *******************************************************************************
    @PostMapping("/salvarAPI")
    public ResponseEntity saveAllFinancasAPI(){
        service.saveAllFinancas();
        return ResponseEntity.created(null).build();
    }

    @PostMapping("/salvar")
    public ResponseEntity saveFinancas(@RequestBody Iterable<Financas> financas){
        service.saveFinancas(financas);
        return ResponseEntity.created(null).build();
    }

    // METODOS PUT *********************************************************************************

    @PutMapping("/atualizar/id/{id}")
    public ResponseEntity updateData(@RequestBody Financas financas, @PathVariable("id") Long id){
        service.updateFinancas(financas, id);
        return ResponseEntity.ok().build();
    }

    // METODOS DELETE *****************************************************************************
    @DeleteMapping("delete/{id}")
    public ResponseEntity deleteFinanca(@PathVariable Long id){
        service.deleteFinancas(id);
        return ResponseEntity.ok().build();
    }
}