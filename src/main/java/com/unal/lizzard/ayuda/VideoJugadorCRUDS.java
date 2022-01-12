package com.unal.lizzard.ayuda;
import com.unal.lizzard.model.Video_Jugadores;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


public interface VideoJugadorCRUDS extends  CrudRepository<Video_Jugadores, Long> {
}
