package com.projetoFinal.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projetoFinal.app.models.Ingredientes;

@Repository
public interface IngredientesRepository extends JpaRepository<Ingredientes, Long> {
}
