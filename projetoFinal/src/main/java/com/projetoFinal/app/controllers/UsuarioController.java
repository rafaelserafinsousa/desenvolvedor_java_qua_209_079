package com.projetoFinal.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projetoFinal.app.models.Usuario;
import org.springframework.web.bind.annotation.RequestMethod;
import com.projetoFinal.app.repository.UserRepository;

@Controller
public class UsuarioController {
    @Autowired
    private UserRepository csr;

    @RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
    public String cadastrar() {
        return "cadastrar";
    }

    @RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
    public String cadastrar(Usuario user) {
        csr.save(user);
        return "redirect:/";
    }

    @RequestMapping("/clientes")
    public ModelAndView listar() {
        ModelAndView mv = new ModelAndView("clientes");
        Iterable<Usuario> usuarios = csr.findAll();
        mv.addObject("usuarios", usuarios);
        return mv;
    }
}


