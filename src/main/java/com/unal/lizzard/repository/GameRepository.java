package com.unal.lizzard.repository;

import com.unal.lizzard.model.Juego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface GameRepository extends CrudRepository<Juego, Long> {

}
