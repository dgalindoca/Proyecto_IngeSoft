package com.unal.lizzard.service;

import com.unal.lizzard.model.Juego;
import com.unal.lizzard.repository.GameRepository;
import com.unal.lizzard.web.GameRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import java.util.List;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository gameRepository;

    public GameServiceImpl(GameRepository gameRepository) {
        super();
        this.gameRepository = gameRepository;
    }

    /*
    @Override
    public Juego guardar(GameRegistrationDto gameRegistrationDto) {
         Juego juego = new Juego(
            gameRegistrationDto.getNombre_Juego(),
            gameRegistrationDto.getNombre_tienda(),
            gameRegistrationDto.getURL()
        );
        return gameRepository.save(juego);
    }

     */

    @Override
    public void guardar(Juego juego) {
        gameRepository.save(juego);
    }

    @Override
    public List<Juego> listarJuegos() {
        return (List<Juego>) gameRepository.findAll();
    }

    @Override
    public void eliminar(Long id) {
        Authentication usuario = SecurityContextHolder.getContext().getAuthentication();
        usuario.getAuthorities();
        gameRepository.deleteById(id);
    }

    @Override
    public Juego buscarPorId(Long id) {
        return gameRepository.findById(id).orElse(null);
    }

}
