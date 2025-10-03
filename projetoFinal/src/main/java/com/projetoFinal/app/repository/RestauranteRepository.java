package com.projetoFinal.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projetoFinal.app.models.Restaurante;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
}

