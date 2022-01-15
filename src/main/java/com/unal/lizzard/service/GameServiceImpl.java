package com.unal.lizzard.service;

import com.unal.lizzard.model.Juego;
import com.unal.lizzard.repository.GameRepository;
import com.unal.lizzard.web.GameRegistrationDto;
import org.springframework.stereotype.Service;

@Service
public class GameServiceImpl implements GameService {
    private GameRepository gameRepository;

    public GameServiceImpl(GameRepository gameRepository) {
        super();
        this.gameRepository = gameRepository;
    }

    @Override
    public Juego guardar(GameRegistrationDto gameRegistrationDto) {
         Juego juego = new Juego(
            gameRegistrationDto.getNombre_Juego(),
            gameRegistrationDto.getNombre_tienda(),
            gameRegistrationDto.getURL()
        );
        return gameRepository.save(juego);
    }
}
