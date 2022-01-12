package com.unal.lizzard.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@MappedSuperclass


public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_persona;
    private String nombre;
    @Column(name = "correo")
    private String correo;
    private String  contraseña;
    //private Collection<Video_Jugadores> video_jugadores;

    public Persona() {
    }

    public Persona( String nombre, String correo, String contraseña) {

        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public long getId_persona() {
        return id_persona;
    }

    public void setId_persona(long id_persona) {
        this.id_persona = id_persona;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}
}


