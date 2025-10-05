package com.projetoFinal.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import com.projetoFinal.app.models.Pratos;
import com.projetoFinal.app.models.Restaurante;
import com.projetoFinal.app.repository.PratosRepository;
import com.projetoFinal.app.repository.RestauranteRepository;

@Controller
public class RestaurantesController {
    @Autowired
    private RestauranteRepository restauranteRepository;

    @Autowired
    private PratosRepository pratosRepository;

    @GetMapping("/restaurantes")
    public String listarRestaurantes(Model model) {
        model.addAttribute("resutaurantes", restauranteRepository.findAll());
        return "restaurantes";
    }

    @PostMapping("/restaurantes")
    public String salvarRestaurantes(@RequestParam String nome, @RequestParam String endereco) {
        Restaurante restaurante = new Restaurante(nome, endereco);
        restauranteRepository.save(restaurante);
        return "redirect:/restaurantes";
    }

    @PostMapping("/restaurantes/{id}/pratos")
    public String adicionarPrato(@PathVariable Long id, @RequestParam String nomePrato) {
        Restaurante restaurante = restauranteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Restaurante não encontrado"));
        Pratos prato = new Pratos();

        prato.setNome(nomePrato);
        prato.setRestaurante(restaurante);

        pratosRepository.save(prato);
        return "redirect:/restaurantes";
    }

}
    