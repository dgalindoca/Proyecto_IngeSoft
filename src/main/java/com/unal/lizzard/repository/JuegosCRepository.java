package com.unal.lizzard.repository;

import com.unal.lizzard.model.Juego;
import com.unal.lizzard.model.JuegosC;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JuegosCRepository extends CrudRepository<JuegosC, Long> {
}
