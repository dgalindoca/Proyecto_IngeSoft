package com.unal.lizzard.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/")
    public String home(){
        return "login";
    }

    @GetMapping("/tienda")
    public String tienda(){
        return "tienda";
    }

    @GetMapping("/registrarion")
    public String registrarse(){
        return "registration";
    }
}
