package com.jhonatan.spring.boot.wed.app.controllers;

import jakarta.servlet.http.HttpServletRequest;
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

    @GetMapping("/mix-params")
    public String param(@RequestParam String saludo,
            @RequestParam Integer numero,
            Model modelo) {
        modelo.addAttribute("resultado", "El saludo enviado es: '" + saludo + "' y el numero es: '" + numero + "'");
        return "params/ver";
    }

    @GetMapping("/mix-params-request")
    public String param(HttpServletRequest request,
            Model modelo) {
        String saludo = request.getParameter("saludo");
        Integer numero = null;
        try {
            numero = Integer.valueOf(request.getParameter("numero"));

        } catch (NumberFormatException e) {
            numero = 0;
        }

        modelo.addAttribute("resultado", "El saludo enviado es: '" + saludo + "' y el numero es: '" + numero + "'");
        return "params/ver";
    }

}
