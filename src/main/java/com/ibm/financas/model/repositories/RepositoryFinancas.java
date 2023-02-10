package com.ibm.financas.model.repositories;

import com.ibm.financas.model.entities.Financas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryFinancas extends JpaRepository<Financas, Long> {
    @Query(value = "SELECT * FROM financas.financas WHERE data_referencia like %:data%", nativeQuery = true)
    List<Financas> findAllDataReferencies(String data);
}
