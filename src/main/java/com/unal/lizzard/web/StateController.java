package com.unal.lizzard.web;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/estado")
public class StateController {
/*
    @GetMapping
    public String stateActivo(){
        Authentication usuario = SecurityContextHolder.getContext().getAuthentication();
        //String state = usuario.getPrincipal().
        return "/biblioteca";
    }

    @GetMapping
    public String stateAusente(){
        return "";
    }

    @GetMapping
    public String stateNoMolestar(){
        return "";
    }

 */
}
