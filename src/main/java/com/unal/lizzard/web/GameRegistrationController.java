package com.unal.lizzard.web;

import com.unal.lizzard.service.GameService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
