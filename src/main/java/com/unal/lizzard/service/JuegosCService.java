package com.unal.lizzard.service;

import com.unal.lizzard.model.Juego;
import com.unal.lizzard.model.JuegosC;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface JuegosCService {
    public JuegosC comprar (Long id_Juego);
    public void eliminar(Long id);
    public Juego buscarPorId(Long id);
    public List<Juego> listarJuegosC();
    public Long Mas_comprado();
}
