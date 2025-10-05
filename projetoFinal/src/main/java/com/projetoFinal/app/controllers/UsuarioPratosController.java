package com.projetoFinal.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projetoFinal.app.models.Alergia;
import com.projetoFinal.app.models.Pratos;
import com.projetoFinal.app.models.Usuario;
import com.projetoFinal.app.repository.PratosRepository;
import com.projetoFinal.app.repository.UsuarioRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class UsuarioPratosController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PratosRepository pratosRepository;

    // Tela para escolher o usuário
    @GetMapping("/selecionarUsuario")
    public String selecionarUsuarioForm(Model model) {
        model.addAttribute("usuarios", usuarioRepository.findAll());
        return "selecionar-usuario"; // página thymeleaf
    }

    // Quando o usuário for escolhido, salva na sessão
    @PostMapping("/selecionarUsuario")
    public String selecionarUsuario(@RequestParam Long idUsuario, HttpSession session) {
        session.setAttribute("usuarioId", idUsuario);
        return "redirect:/pratosSeguros";
    }

    // Lista os pratos filtrados pelas alergias do usuário
    @GetMapping("/pratos/seguros/{idUsuario}")
public String mostrarPratosSeguros(@PathVariable Long idUsuario, Model model) {
    Usuario usuario = usuarioRepository.findById(idUsuario)
            .orElseThrow(() -> new IllegalArgumentException("Usuário não encontrado"));

    List<Alergia> alergiasUsuario = usuario.getAlergias(); // agora funciona ✅
    List<Pratos> todosPratos = pratosRepository.findAll();

    // filtra pratos sem ingredientes que o usuário é alérgico
    List<Pratos> pratosSeguros = todosPratos.stream()
            .filter(prato -> prato.getIngredientes().stream()
                    .noneMatch(ingrediente -> 
                        alergiasUsuario.stream()
                            .anyMatch(alergia -> alergia.getNome().equalsIgnoreCase(ingrediente.getNome()))
                    )
            )
            .toList();

    model.addAttribute("pratosSeguros", pratosSeguros);
    return "pratosSeguros";
}

    }


