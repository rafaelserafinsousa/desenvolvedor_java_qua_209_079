package com.modularizacao.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModuloController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/cadastro")
    public String cadastro(){
        return "cadastro";
    }
}
