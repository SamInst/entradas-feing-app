package com.example.appmotel.repository;

import com.example.appmotel.model.Pernoites;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface PernoitesRepository extends JpaRepository <Pernoites, Long> {


    List<Pernoites> findByDataEntrada(LocalDate dataEntrada);
    List<Pernoites> findByDataSaida(LocalDate dataEntrada);
    List<Pernoites> findByApartamento_Id(Long apt);
}