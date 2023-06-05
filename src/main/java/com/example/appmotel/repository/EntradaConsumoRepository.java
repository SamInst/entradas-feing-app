package com.example.appmotel.repository;

import com.example.appmotel.model.EntradaConsumo;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EntradaConsumoRepository extends JpaRepository<EntradaConsumo, Long> {
    List<EntradaConsumo> findEntradaConsumoByEntradas_Id(Long id);
    @Transactional
    void deleteEntradaConsumoByEntradas_Id(Long id);
}
