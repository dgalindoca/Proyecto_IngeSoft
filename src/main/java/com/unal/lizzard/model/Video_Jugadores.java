package com.unal.lizzard.model;

import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Video_Jugadores")

public  class Video_Jugadores extends  Persona {

    @Column(name = "id_Videojugador")
    private Long id_Videojugador;
    private String nickname;

    public  Video_Jugadores(String nickname) {
        super();

        this.nickname = nickname;
    }
    public Video_Jugadores( ) {

    }

    public Long getId_Videojugador() {
        return id_Videojugador;
    }

    public void setId_Videojugador(Long id_Videojugador) {
        this.id_Videojugador = id_Videojugador;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
