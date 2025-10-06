package com.projetoFinal.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
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

   @PostMapping("/cadastrar")
public String salvarUsuario(
        @RequestParam String nome,
        @RequestParam String cpf,
        @RequestParam String email,
        @RequestParam String telefone,
        @RequestParam String endereco,
        @RequestParam(required = false) List<String> alergias,
        @RequestParam(required = false) String outraAlergia) {

    Usuario usuario = new Usuario();
    usuario.setNome(nome);
    usuario.setCpf(cpf);
    usuario.setEmail(email);
    usuario.setTelefone(telefone);
    usuario.setEndereco(endereco);

    List<Alergia> listaAlergias = new ArrayList<>();

    if (alergias != null) {
        for (String a : alergias) {
            if (!a.trim().isEmpty()) {
                Alergia alergia = alergiaRepository.findByNomeIgnoreCase(a.trim())
                        .orElseGet(() -> {
                            Alergia nova = new Alergia();
                            nova.setNome(a.trim());
                            return alergiaRepository.save(nova);
                        });
                listaAlergias.add(alergia);
            }
        }
    }

    if (outraAlergia != null && !outraAlergia.trim().isEmpty()) {
        Alergia alergia = alergiaRepository.findByNomeIgnoreCase(outraAlergia.trim())
                .orElseGet(() -> {
                    Alergia nova = new Alergia();
                    nova.setNome(outraAlergia.trim());
                    return alergiaRepository.save(nova);
                });
        listaAlergias.add(alergia);
    }

    usuario.setAlergias(listaAlergias);
    usuarioRepository.save(usuario);

    return "redirect:/";
}

}
