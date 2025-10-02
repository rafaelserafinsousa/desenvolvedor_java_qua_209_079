package com.projetoFinal.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetoFinal.app.models.Alergia;
import java.util.Optional;

public interface AlergiaRepository extends JpaRepository<Alergia, Long> {
    Optional<Alergia> findByNomeIgnoreCase(String nome); // <- adiciona esse método
}