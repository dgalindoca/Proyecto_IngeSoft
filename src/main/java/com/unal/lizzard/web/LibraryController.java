package com.unal.lizzard.web;

import com.unal.lizzard.model.Compra;
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
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class LibraryController {

    @Autowired
    private GameService gameService;

    @Autowired
    private JuegosCService juegosCService;

    @GetMapping("/estado")
    public String estado(){return "/estado";}

    @GetMapping ("/biblioteca")
    public String listarJuegosC(Model model){
        List<Compra> listadoJuegosC = juegosCService.listarJuegosC();
        model.addAttribute("Titulo","Lista de Juegos");
        model.addAttribute("juegosC", listadoJuegosC);
        return "/biblioteca";
    }

    @GetMapping("/deleteC/{id_juego}")
    public String eliminarCompra(@PathVariable ("id_juego") Long id_JuegoC){
        juegosCService.eliminar(id_JuegoC);
        return "redirect:/biblioteca";
    }
}
