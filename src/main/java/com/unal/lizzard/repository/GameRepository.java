package com.unal.lizzard.repository;

import com.unal.lizzard.model.Juego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Juego, Long> {

}
