package com.unal.lizzard.service;

import com.unal.lizzard.model.Video_Jugadores;
import com.unal.lizzard.web.Video_JugadoresRegistrationDto;

import java.util.List;

public interface Video_JugadoresService {
    Video_Jugadores guardar(Video_JugadoresRegistrationDto registrationDto);

}
