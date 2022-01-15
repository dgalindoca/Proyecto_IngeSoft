package com.unal.lizzard.service;
import com.unal.lizzard.model.Juego;
import com.unal.lizzard.web.GameRegistrationDto;

public interface GameService {
    Juego guardar(GameRegistrationDto gameRegistrationDto);
}
