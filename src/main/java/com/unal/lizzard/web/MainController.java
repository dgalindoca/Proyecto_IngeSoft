package com.unal.lizzard.web;

import com.unal.lizzard.model.User;
import com.unal.lizzard.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//prueba
@Controller
public class MainController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }
    /*@GetMapping("/")
    public String home(){
        return "tienda";
    }

     */

    /*@GetMapping("/tienda")
    public String tienda(){
        return "tienda";
    }

     */

    @GetMapping("/registrarion")
    public String registrarse(){
        return "registration";
    }


}
