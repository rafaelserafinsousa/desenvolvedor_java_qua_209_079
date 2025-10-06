package com.projetoFinal.app.controllers;

import com.projetoFinal.app.models.*; // Importe todos os seus modelos
import com.projetoFinal.app.repository.PratosRepository;
import com.projetoFinal.app.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Controller
public class RestaurantesController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PratosRepository pratosRepository;

    @GetMapping("/login")
    public String mostrarPaginaSelecao(Model model) {
        model.addAttribute("usuarios", usuarioRepository.findAll());
        return "login"; 
    }

    @PostMapping("/restaurantes")
    public String carregarRestaurantesParaUsuario(@RequestParam("idUsuario") Long idUsuario, Model model) {
        Usuario usuario = usuarioRepository.findById(idUsuario)
                .orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado: " + idUsuario));

        List<Pratos> todosPratos = pratosRepository.findAll();
        Set<Alergia> alergiasDoUsuario = new HashSet<>(usuario.getAlergias());

        List<Pratos> pratosPermitidos = todosPratos.stream()
            .filter(prato ->
                prato.getIngredientes().stream()
                    .noneMatch(ingrediente ->
                        ingrediente.getAlergias().stream()
                            .anyMatch(alergiaDoIngrediente -> alergiasDoUsuario.contains(alergiaDoIngrediente))
                    )
            )
            .collect(Collectors.toList());

        Map<Restaurante, List<Pratos>> restaurantesComPratos = pratosPermitidos.stream()
                .collect(Collectors.groupingBy(Pratos::getRestaurante));

        model.addAttribute("usuario", usuario);
        model.addAttribute("restaurantesComPratos", restaurantesComPratos);

        return "restaurantes"; 
    }
}