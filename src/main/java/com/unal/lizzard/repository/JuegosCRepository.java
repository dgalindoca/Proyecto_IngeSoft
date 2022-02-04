package com.unal.lizzard.repository;

import com.unal.lizzard.model.Juego;
import com.unal.lizzard.model.JuegosC;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
public interface JuegosCRepository extends CrudRepository<JuegosC, Long> {

    @Query("Select mi from JuegosC mi")
    public List<JuegosC> findByMas_comprado();

}
