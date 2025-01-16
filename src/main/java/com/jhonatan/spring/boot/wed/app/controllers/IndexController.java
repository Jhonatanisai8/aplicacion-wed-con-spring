package com.jhonatan.spring.boot.wed.app.controllers;

import com.jhonatan.spring.boot.wed.app.models.Usuario;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {

    @Value("${texto.indexController.index.titulo}")
    private String textoIndex;
    @Value("${texto.indexController.perfil.titulo}")
    private String textoPerfil;
    @Value("${texto.indexController.listar.titulo}")
    private String textoListar;

    @GetMapping({"/", "", "/index", "/home"})
    public String index(Model modelo) {
        modelo.addAttribute("titulo", textoIndex);
        return "index";
    }

    @RequestMapping("/perfil")
    public String perfil(Model model) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Andrez");
        usuario.setApellido("Peralta");
        //usuario.setEmail("andrez@gmail.com.pe");
        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", textoPerfil.concat(usuario.getNombre()));

        return "perfil";
    }

    @RequestMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("titulo", textoListar);
        return "listar";
    }

    @ModelAttribute("usuarios") //se utiliza para vincular datos al modelo y hacer que estos datos estén disponibles en las vistas 
    public List<Usuario> poblarUsuarios() {
        List<Usuario> usuarios = Arrays.asList(
                new Usuario("David", "Calle", "davidcalle34@gmail.com"),
                new Usuario("Juan", "Perez", "juanperex231@gmail.com"),
                new Usuario("Daniel", "Castillo", "danielcastillo908@gmail.com"),
                new Usuario("Damasco", "Rosado", "damasco909@gmail.com")
        );
        return usuarios;
    }
}
