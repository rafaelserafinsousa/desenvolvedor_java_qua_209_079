package com.projetoFinal.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projetoFinal.app.models.Alergia;
import com.projetoFinal.app.models.Usuario;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.projetoFinal.app.repository.AlergiaRepository;
import com.projetoFinal.app.repository.UsuarioRepository;

@Controller
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private AlergiaRepository alergiaRepository; 

    @RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
    public ModelAndView formCadastro() {
        ModelAndView mv = new ModelAndView("cadastrar");
        mv.addObject("todasAlergias", alergiaRepository.findAll());
        return mv;
    }

    @RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
    public String salvarUsuario(@RequestParam String nome, @RequestParam(required=false) List<String> alergiasDigitadas) {
        Usuario usuario = new Usuario();
        usuario.setNome(nome);
        usuario.setCpf(nome);
        usuario.setNome(nome);
        usuario.setNome(nome);

        List<Alergia> listaAlergias = new ArrayList<>();
        if (alergiasDigitadas != null){
            for(String alergiaNome : alergiasDigitadas) {
                Alergia alergia = alergiaRepository.findByNomeIgnoreCase(alergiaNome).orElseGet(() -> {Alergia nova = new Alergia(); nova.setNome(alergiaNome); return alergiaRepository.save(nova); });
                listaAlergias.add(alergia);
            }
        }
        usuario.setAlergias(listaAlergias);
        usuarioRepository.save(usuario);

        return "redirect:/clientes";  

    }

    @RequestMapping("/clientes")
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView("clientes");
        mv.addObject("usuarios", usuarioRepository.findAll());
        return mv;
    }
}

