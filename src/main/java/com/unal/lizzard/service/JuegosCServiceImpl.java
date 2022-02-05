package com.unal.lizzard.service;

import com.unal.lizzard.model.Compra;
import com.unal.lizzard.model.Juego;
import com.unal.lizzard.model.JuegosC;
import com.unal.lizzard.repository.GameRepository;
import com.unal.lizzard.repository.JuegosCRepository;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
        usuario.getAuthorities();
        String id_Usuario = usuario.getName();
        JuegosC juego = new JuegosC(id_Juego,id_Usuario);
        return juegosCRepository.save(juego);
    }

    public Juego buscarPorId(Long id){
        return gameRepository.findById(id).orElse(null);
    }

    @Override
    public List<Compra> listarJuegosC(){
        ArrayList<JuegosC> juegosComp = (ArrayList<JuegosC>) juegosCRepository.findAll();
        List<Compra> aux = new ArrayList<>();
        Authentication usuario = SecurityContextHolder.getContext().getAuthentication();
        String id_Usuario = usuario.getName();

        for(int i = 0; i < juegosComp.size(); i++){
            if (juegosComp.get(i).getId_Usuario().equals(id_Usuario)){
                JuegosC auxJC = juegosComp.get(i);
                Juego auxJ = buscarPorId(auxJC.getId_Juego());
                Compra auxC = new Compra(auxJC.getId_JuegosC(), auxJ.getId_Juego(), auxJ.getNombre_Juego(), auxJ.getNombre_tienda(), auxJ.getURL());
                aux.add(auxC);
            }
        }
        return aux;
    }

    @Override
    public void eliminar(Long id) {
        Authentication usuario = SecurityContextHolder.getContext().getAuthentication();
        usuario.getAuthorities();
        juegosCRepository.deleteById(id);
    }

    @Override
    public Long Mas_comprado(){
        List<Long> aux = juegosCRepository.findByMas_comprado().stream().map(JuegosC::getId_Juego).collect(Collectors.toList());
        HashMap<Long, Integer> mapa = new HashMap<>();
        for (int x = 0; x < aux.size(); x++) {
            Long numero = aux.get(x);
            if (mapa.containsKey(numero)) {
                mapa.put(numero, mapa.get(numero) + 1);
            } else {
                mapa.put(numero, 1);
            }
        }
        int mayor = 0;
        Long moda = null;
        for (HashMap.Entry<Long, Integer> entry : mapa.entrySet()) {
            if (entry.getValue() > mayor) {
                mayor = entry.getValue();
                moda = entry.getKey();
            }
        }
        return moda;
    }
}
