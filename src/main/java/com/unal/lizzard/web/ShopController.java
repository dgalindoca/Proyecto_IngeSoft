package com.unal.lizzard.web;

import com.unal.lizzard.model.Juego;
import com.unal.lizzard.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class ShopController {

    @Autowired
    private GameService gameService;

    @GetMapping("/")
    public String listarJuegos(Model model){
        List<Juego> ListadoJuegos = gameService.listarJuegos();
        model.addAttribute("Titulo","Lista de Juegos");
        model.addAttribute("juegos", ListadoJuegos);
        return "/tienda";
    }
}
