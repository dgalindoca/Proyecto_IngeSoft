package com.unal.lizzard.service;

import com.unal.lizzard.ayuda.VideoJugadorCRUDS;
import com.unal.lizzard.model.Video_Jugadores;
import com.unal.lizzard.repository.Video_JugadoresRepository;
import com.unal.lizzard.web.Video_JugadoresRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service
public class Video_JugadoresServiceImpl implements Video_JugadoresService {

    private Video_JugadoresRepository video_jugadoresRepository;

    public Video_JugadoresServiceImpl(Video_JugadoresRepository video_jugadoresRepository){
        super();
        this.video_jugadoresRepository = video_jugadoresRepository;
    }



    @Override
    public Video_Jugadores guardar(Video_JugadoresRegistrationDto registrationDto) {

        Video_Jugadores video_jugadores = new Video_Jugadores(


                registrationDto.getNickname()

        );
        return video_jugadoresRepository.save(video_jugadores);




    }





}
