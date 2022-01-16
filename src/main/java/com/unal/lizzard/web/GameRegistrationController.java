package com.unal.lizzard.web;

import com.unal.lizzard.model.Juego;
import com.unal.lizzard.service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/gameRegistration")
public class GameRegistrationController {
    private GameService gameService;

    public GameRegistrationController(GameService gameService) {
        super();
        this.gameService = gameService;
    }

    @ModelAttribute("game")
    public GameRegistrationDto gameRegistrationDto() {
        return new GameRegistrationDto();
    }

    @GetMapping
    public String showRegistrationForm() {
        return "gameRegistration";
    }

    @PostMapping
    public String registerGame(@ModelAttribute("game")GameRegistrationDto gameRegistrationDto) {
        gameService.guardar(gameRegistrationDto);
        return "redirect:/gameRegistration?success";
    }


}
