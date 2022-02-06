package com.unal.lizzard;

import com.unal.lizzard.model.Juego;
import com.unal.lizzard.model.JuegosC;
import com.unal.lizzard.model.Role;
import com.unal.lizzard.model.User;
import com.unal.lizzard.repository.GameRepository;
import com.unal.lizzard.repository.JuegosCRepository;
import com.unal.lizzard.service.GameService;
import com.unal.lizzard.service.JuegosCService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert.*;
import org.junit.Before;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class LizzardApplicationTests {

    @Autowired
    private TestEntityManager testEntityManager;

    @Autowired
    private JuegosCRepository juegosCRepository;

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private JuegosCService juegosCService;

    @Autowired
    private GameService gameService;

    @Test
    public void agregarBiblioteca(){
        //Creando nuevo juego y usuario
        Juego juego = new Juego("God of War", "Epic Games", "https://www.epicgames.com/store/es-ES/p/god-of-war");
        User user = new User("example", "example", "example", Arrays.asList(new Role("Role_User")));
        testEntityManager.persistAndFlush(user);
        testEntityManager.persistAndFlush(juego);
        gameService.guardar(juego);

        //Creando nuevo juegoComprado con el id del juego y el nombre de usuario con los 2 objetos creados anteriormente
        JuegosC juegoC = new JuegosC(juego.getId_Juego(),user.getUsername());
        testEntityManager.persistAndFlush(juegoC);
        juegosCRepository.save(juegoC);

        assertThat(juegosCRepository.findById(juegoC.getId_JuegosC()));
    }

        @Test
        public void verBiblioteca() {
        //Creando nuevo juego y usuario
        Juego juego = new Juego("God of War", "Epic Games", "https://www.epicgames.com/store/es-ES/p/god-of-war");
        User user = new User("example", "example", "example", Arrays.asList(new Role("Role_User")));
        testEntityManager.persistAndFlush(user);
        testEntityManager.persistAndFlush(juego);
        gameService.guardar(juego);

        //Creando nuevo juegoComprado con el id del juego y el nombre de usuario con los 2 objetos creados anteriormente
        JuegosC juegoC = new JuegosC(juego.getId_Juego(), user.getUsername());
        testEntityManager.persistAndFlush(juegoC);
        juegosCRepository.save(juegoC);

        assertThat(juegosCRepository.findAll()).isNotEqualTo(null);

        }

        @Test
        public void eliminarBiblioteca(){
        //Creando nuevo juego y usuario
        Juego juego = new Juego("God of War", "Epic Games", "https://www.epicgames.com/store/es-ES/p/god-of-war");
        User user = new User("example", "example", "example", Arrays.asList(new Role("Role_User")));
        testEntityManager.persistAndFlush(user);
        testEntityManager.persistAndFlush(juego);
        gameService.guardar(juego);

        //Creando nuevo juegoComprado con el id del juego y el nombre de usuario con los 2 objetos creados anteriormente
        JuegosC juegoC = new JuegosC(juego.getId_Juego(),user.getUsername());
        testEntityManager.persistAndFlush(juegoC);
        juegosCRepository.save(juegoC);

        //Eliminando de la biblioteca
        juegosCRepository.deleteAll();

        assertThat((juegosCRepository.findAll())).isEqualTo(null);


    }
}
