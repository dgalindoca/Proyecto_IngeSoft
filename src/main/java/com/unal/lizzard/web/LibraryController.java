package com.unal.lizzard.web;

import com.unal.lizzard.model.Juego;
import com.unal.lizzard.model.JuegosC;
import com.unal.lizzard.service.GameService;
import com.unal.lizzard.service.JuegosCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/biblioteca")
public class LibraryController {

    @Autowired
    private GameService gameService;

    @Autowired
    private JuegosCService juegosCService;

    @GetMapping("/tienda")
    public String tienda(){return "/";}

    @GetMapping("/estado")
    public String estado(){return "redirect:/estado";}

    @GetMapping ("/biblioteca")
    public String listarJuegosC(Model model){
        System.out.println("###Entra###");
        List<Juego> ListadoJuegosC = juegosCService.listarJuegosC();
        model.addAttribute("Titulo","Lista de Juegos");
        model.addAttribute("juegos", ListadoJuegosC);
        return "/biblioteca";
    }
}
