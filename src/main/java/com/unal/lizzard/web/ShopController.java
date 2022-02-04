package com.unal.lizzard.web;

import com.unal.lizzard.model.Juego;
import com.unal.lizzard.service.GameService;
import com.unal.lizzard.service.JuegosCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class ShopController {

    @Autowired
    private GameService gameService;

    @Autowired
    private JuegosCService juegosCService;

    @GetMapping("/")
    public String listarJuegos(Model model){
        List<Juego> ListadoJuegos = gameService.listarJuegos();
        model.addAttribute("Titulo","Lista de Juegos");
        model.addAttribute("juegos", ListadoJuegos);
        return "/tienda";
    }
    @GetMapping("/delete/{id}")
    public String eliminar(@PathVariable("id") Long id_Juego){
       gameService.eliminar(id_Juego);
       System.out.println("Registro Eliminado con Exito!");
       return "redirect:/";
    }
    @GetMapping("/biblioteca")
    public String biblioteca(){return "/biblioteca";}
    @GetMapping("/edit/{id}")
    public String editar(@PathVariable("id")Long id_Juego, Model model){
        Juego juego= gameService.buscarPorId(id_Juego);
        List<Juego> ListadoJuegos = gameService.listarJuegos();
        model.addAttribute("juego",juego);
        model.addAttribute("juegos", ListadoJuegos);
        return "redirect:/gameRegistration";
    }

    @GetMapping("/MC")
    public String MasComprado(Model model){
        Juego juego = gameService.buscarPorId(juegosCService.Mas_comprado());
        model.addAttribute("juego", juego);
        return "/tienda";
    }

    @GetMapping ("/buy/{id}")
    public String comprar(@PathVariable("id") Long id_Juego){
        juegosCService.comprar(id_Juego);
        return "redirect:/";
    }
}
