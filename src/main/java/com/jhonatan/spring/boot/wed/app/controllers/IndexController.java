package com.jhonatan.spring.boot.wed.app.controllers;

import com.jhonatan.spring.boot.wed.app.models.Usuario;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
        //usuario.setEmail("andrez@gmail.com.pe");
        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Perfil de Usuario: ".concat(usuario.getNombre()));

        return "perfil";
    }

    @RequestMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("titulo", "Listado de Usuarios.");
        List<Usuario> usuarios = Arrays.asList(
                new Usuario("David", "Calle", "davidcalle34@gmail.com"),
                new Usuario("Juan", "Perez", "juanperex231@gmail.com"),
                new Usuario("Daniel", "Castillo", "danielcastillo908@gmail.com"),
                new Usuario("Damasco", "Rosado", "damasco909@gmail.com")
        );

        model.addAttribute("usuarios", usuarios);
        return "listar";
    }

}
