package com.jhonatan.spring.boot.wed.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params") // ruta  base 
public class EjemploParamsController {

    @GetMapping("/")
    public String index() {
        return "params/index";
    }

    @GetMapping("/string")
    public String param(@RequestParam(name = "texto",
            required = false,
            defaultValue = "Valor por defecto.") String texto,
            Model modelo) {
        modelo.addAttribute("resultado", "El texto enviado es: " + texto);
        return "params/ver";
    }

}
