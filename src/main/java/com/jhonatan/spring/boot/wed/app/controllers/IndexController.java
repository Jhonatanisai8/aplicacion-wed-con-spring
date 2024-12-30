package com.jhonatan.spring.boot.wed.app.controllers;

import com.jhonatan.spring.boot.wed.app.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping("/index")
    public String index(Model modelo) {
        modelo.addAttribute("titulo", "Hola Spring con Model.");
        return "index";
    }

    @RequestMapping("/perfil")
    public String perfil(Model model) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Andrez");
        usuario.setApellido("Peralta");

        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Perfil de Usuario: ".concat(usuario.getNombre()));

        return "perfil";
    }
}
