package com.projetoFinal.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;


import com.projetoFinal.app.models.Pratos;
import com.projetoFinal.app.models.Usuario;
import com.projetoFinal.app.repository.PratosRepository;
import com.projetoFinal.app.repository.UsuarioRepository;

@Controller
public class PratosController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PratosRepository pratosRepository;

    @GetMapping("/comaseguro/{idUsuario}")
    public String mostrarPratosSeguros(@PathVariable Long idUsuario, Model model) {
        Usuario usuario = usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado"));

        List<Pratos> todosPratos = pratosRepository.findAll();

        List<Pratos> pratosSeguros = todosPratos.stream()
                .filter(prato -> usuario.getAlergias().stream()
                        .noneMatch(alergia ->
                                prato.getIngredientes().stream()
                                        .anyMatch(ingrediente -> ingrediente.getNome()
                                                .equalsIgnoreCase(alergia.getNome()))
                        )
                )
                .toList();

        model.addAttribute("usuario", usuario);
        model.addAttribute("pratos", pratosSeguros);

        return "restaurantes";
    }
}