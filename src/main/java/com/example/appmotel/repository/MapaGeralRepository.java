package com.example.appmotel.repository;


import com.example.appmotel.model.MapaGeral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;


@Repository
public interface MapaGeralRepository extends JpaRepository<MapaGeral, Long> {
    @Query("select u from MapaGeral u where u.data = :data")
    List<MapaGeral> findByData(LocalDate data);
}
