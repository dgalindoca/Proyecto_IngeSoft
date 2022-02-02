package com.unal.lizzard.service;

import com.unal.lizzard.model.Juego;
import com.unal.lizzard.model.JuegosC;
import com.unal.lizzard.repository.GameRepository;
import com.unal.lizzard.repository.JuegosCRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class JuegosCServiceImpl implements JuegosCService{

    @Autowired
    private JuegosCRepository juegosCRepository;
    @Autowired
    private GameRepository gameRepository;

    public JuegosCServiceImpl(JuegosCRepository  juegosCRepository) {
        super();
        this.juegosCRepository = juegosCRepository;
    }

    @Override
    public JuegosC comprar(Long id_Juego) {
        Authentication usuario = SecurityContextHolder.getContext().getAuthentication();
        String id_Usuario = usuario.getName();
        JuegosC juego = new JuegosC(id_Juego,id_Usuario);
        return juegosCRepository.save(juego);
    }

    public Juego buscarPorId(Long id){
        return gameRepository.findById(id).orElse(null);
    }
    @Override
    public List<Juego> listarJuegosC(){
        ArrayList<JuegosC> juegosComp = (ArrayList<JuegosC>) juegosCRepository.findAll();
        List<Juego> aux = new ArrayList<>();
        Authentication usuario = SecurityContextHolder.getContext().getAuthentication();
        String id_Usuario = usuario.getName();

        for(int i = 0; i < juegosComp.size(); i++){
            if (juegosComp.get(i).getId_Usuario().equals(id_Usuario)){
                aux.add(buscarPorId(juegosComp.get(i).getId_Juego()));
            }
        }
        System.out.println(aux);
        return aux;
    }
    @Override
    public void eliminar(Long id){

    }
}
