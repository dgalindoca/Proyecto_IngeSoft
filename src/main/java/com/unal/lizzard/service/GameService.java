package com.unal.lizzard.service;
import com.unal.lizzard.model.Juego;
import com.unal.lizzard.web.GameRegistrationDto;
import java.util.List;

public interface GameService {
    //Juego guardar(Juego juego);
    public void guardar(Juego juego);
    public List<Juego> listarJuegos();
    public void eliminar(Long id);
    public Juego buscarPorId(Long id);
}
