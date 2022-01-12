package com.unal.lizzard.web;



import com.unal.lizzard.model.Video_Jugadores;
import com.unal.lizzard.service.Video_JugadoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/registration")
public class Video_JugadoresRegistrationController {

    @Autowired
    private Video_JugadoresService videoJugadoresService;
    public Video_JugadoresRegistrationController(Video_JugadoresService videoJugadoresService){
        super();
        this.videoJugadoresService=videoJugadoresService;
    }
    @GetMapping
    public String showRegistrationForm(){
        return "registration";
    }

    @PostMapping
    public String guardar (@ModelAttribute ("video_Jugadores")Video_JugadoresRegistrationDto registrationDto){
        System.out.println(guardar(registrationDto));
        System.out.println(registrationDto);
        videoJugadoresService.guardar(registrationDto);
        return "redirect:/registration?success";

    }





    @ModelAttribute("video_Jugadores")
    public Video_JugadoresRegistrationDto video_jugadoresRegistrationDto() {
        return  new Video_JugadoresRegistrationDto();
    }
}
