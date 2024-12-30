package com.jhonatan.spring.boot.wed.app.controllers;

import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String index(Map<String, String> model) {
        model.put("titulo", "Hola Spring Framework 02. con ");
        return "index";
    }
}
