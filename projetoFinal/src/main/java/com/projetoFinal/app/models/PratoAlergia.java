package com.projetoFinal.app.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoFinal.app.repository.PratosRepository;

@Service
public class PratoAlergia {

    @Autowired
    private PratosRepository pratosRepository;

    public List<Pratos> listarPratosSeguros(Usuario usuario) {
        List<Pratos> todosPratos = pratosRepository.findAll();

        return todosPratos.stream()
                .filter(prato -> usuario.getAlergias().stream()
                        .noneMatch(alergia -> prato.getIngredientes().stream()
                                .anyMatch(ingrediente -> ingrediente.getNome()
                                        .equalsIgnoreCase(alergia.getNome()))))
                .toList();
    }
}
