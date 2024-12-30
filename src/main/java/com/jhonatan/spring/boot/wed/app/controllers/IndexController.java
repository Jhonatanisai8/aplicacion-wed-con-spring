package com.jhonatan.spring.boot.wed.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(Model modelo) {
        modelo.addAttribute("titulo", "Hola Spring con Model.");
        return "index";
    }
}
