package com.unal.lizzard.service;

import com.unal.lizzard.model.JuegosC;

public interface JuegosCService {
    public JuegosC comprar (Long id_Juego);
    public void eliminar(Long id);
}
