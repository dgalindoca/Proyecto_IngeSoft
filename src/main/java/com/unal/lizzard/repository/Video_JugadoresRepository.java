package com.unal.lizzard.repository;


import com.unal.lizzard.model.Video_Jugadores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Video_JugadoresRepository extends JpaRepository<Video_Jugadores, Long> {
}
