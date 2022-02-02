package com.unal.lizzard.service;


import com.unal.lizzard.model.Juego;
import com.unal.lizzard.model.JuegosC;
import com.unal.lizzard.repository.GameRepository;
import com.unal.lizzard.repository.JuegosCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JuegosCServiceImpl implements JuegosCService{

    @Autowired
    private JuegosCRepository juegosCRepository;

    public JuegosCServiceImpl(JuegosCRepository  juegosCRepository) {
        super();
        this.juegosCRepository = juegosCRepository;
    }

    @Override
    public JuegosC comprar(Long id_Juego, Long id_Usuario) {
        JuegosC juego = new JuegosC(id_Juego,id_Usuario);
        return juegosCRepository.save(juego);
    }

    @Override
    public void eliminar(Long id){

    }
}
