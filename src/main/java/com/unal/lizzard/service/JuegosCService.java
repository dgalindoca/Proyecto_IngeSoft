package com.unal.lizzard.service;

import com.unal.lizzard.model.JuegosC;

public interface JuegosCService {
    public JuegosC comprar (Long id_Juego, Long id_Usuario);
    public void eliminar(Long id);
}
