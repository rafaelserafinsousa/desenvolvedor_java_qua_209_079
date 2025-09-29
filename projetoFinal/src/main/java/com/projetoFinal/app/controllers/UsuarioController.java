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

// package com.projeto_final.app.controllers;

// import com.projeto_final.app.models.Pet;
// import com.projeto_final.app.models.Cliente;
// import com.projeto_final.app.repositories.PetRepository;
// import com.projeto_final.app.repositories.ClienteRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.*;
// import org.springframework.web.servlet.ModelAndView;
// import org.springframework.web.servlet.mvc.support.RedirectAttributes;

// @Controller
// @RequestMapping("/pets")
// public class PetController {
    
//     @Autowired
//     private PetRepository petRepository;
    
//     @Autowired
//     private ClienteRepository clienteRepository;

//     @GetMapping("/listar")
//     public ModelAndView listar() {
//         ModelAndView mv = new ModelAndView("pets/listar");
//         Iterable<Pet> pets = petRepository.findAll();
//         mv.addObject("pets", pets);
//         return mv;
//     }

//     // Changed from "/form" to "/novo"
//     @GetMapping("/novo")
//     public String formNovo(Model model) {
//         model.addAttribute("pet", new Pet());
//         Iterable<Cliente> clientes = clienteRepository.findAll();
//         model.addAttribute("clientes", clientes);
//     return "pets/cadastrar";
//     }

//     @GetMapping("/editar/{id}")
//     public String formEditar(@PathVariable Long id, Model model) {
//         Pet pet = petRepository.findById(id)
//                 .orElseThrow(() -> new IllegalArgumentException("Pet inválido: " + id));
//         model.addAttribute("pet", pet);
//         Iterable<Cliente> clientes = clienteRepository.findAll();
//         model.addAttribute("clientes", clientes);
//         return "pets/cadastrar";
//     }

//     @PostMapping("/salvar")
//     public String salvar(@ModelAttribute Pet pet, @RequestParam Long proprietario, RedirectAttributes attrs) {
//         Cliente cliente = clienteRepository.findById(proprietario)
//                 .orElseThrow(() -> new IllegalArgumentException("Cliente inválido: " + proprietario));
//         pet.setProprietario(cliente);
//         petRepository.save(pet);
//         attrs.addFlashAttribute("mensagem", "Pet salvo com sucesso!");
//         return "redirect:/pets/listar";
//     }

//     @GetMapping("/deletar/{id}")
//     public String deletar(@PathVariable Long id, RedirectAttributes attrs) {
//         petRepository.deleteById(id);
//         attrs.addFlashAttribute("mensagem", "Pet deletado com sucesso!");
//         return "redirect:/pets/listar";
//     }

//     @GetMapping("/detalhes/{id}")
//     public String detalhes(@PathVariable Long id, Model model) {
//         Pet pet = petRepository.findById(id)
//                 .orElseThrow(() -> new IllegalArgumentException("Pet inválido: " + id));
//         model.addAttribute("pet", pet);
//         return "pets/detalhes";
//     }

//     @GetMapping("/buscar")
//     public String buscar(@RequestParam String termo, Model model) {
//         Iterable<Pet> pets = petRepository.findByNomeContainingIgnoreCase(termo);
//         model.addAttribute("pets", pets);
//         return "pets/listar";
//     }

//     @GetMapping("/cliente/{idCliente}")
//     public String petsPorCliente(@PathVariable Long idCliente) {
//         return "redirect:/pets/listar";
//     }
// }