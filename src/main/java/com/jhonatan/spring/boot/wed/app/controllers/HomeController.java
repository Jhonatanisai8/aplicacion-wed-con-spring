package com.jhonatan.spring.boot.wed.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        //return "redirect:/app/index";
        //return "redirect:https://google.com";
        return "forward:/app/index";
    }
}
