package com.unal.lizzard.model;
import javax.persistence.*;

@Entity
@Table (name = "Juego")
public class Juego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_Juego;
    @Column(name = "Nombre_Juego")
    private String  Nombre_Juego;
    private String correo;
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Administradores administradores;
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Video_Jugadores video_jugadores;


    public Juego() {
    }

    public Juego(String nombre_Juego, String correo, Persona persona, Video_Jugadores video_jugadores) {
        Nombre_Juego = nombre_Juego;
        this.correo = correo;
        this.video_jugadores = video_jugadores;
        this.administradores = administradores;
    }

    public long getId_Juego() {
        return id_Juego;
    }

    public void setId_Juego(long id_Juego) {
        this.id_Juego = id_Juego;
    }



    public String getNombre_Juego() {
        return Nombre_Juego;
    }

    public void setNombre_Juego(String nombre_Juego) {
        Nombre_Juego = nombre_Juego;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
