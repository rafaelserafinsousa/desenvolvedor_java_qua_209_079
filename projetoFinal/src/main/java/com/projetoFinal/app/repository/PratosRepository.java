package com.projetoFinal.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projetoFinal.app.models.Pratos;

@Repository
public interface PratosRepository extends JpaRepository<Pratos, Long> {
}
