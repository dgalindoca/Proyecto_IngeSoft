package com.unal.lizzard.model;


import javax.persistence.*;

@Entity
@Table(name = "JuegosC")
public class JuegosC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_JuegosC;
    @Column(name = "Juego")
    private Long id_Juego;
    @Column(name = "Usuario")
    private String id_Usuario;

    public JuegosC() {
    }

    public JuegosC(Long id_Juego, String id_Usuario) {
        this.id_Juego = id_Juego;
        this.id_Usuario = id_Usuario;
    }

    public Long getId_JuegosC() {
        return id_JuegosC;
    }

    public void setId_JuegosC(Long id_JuegosC) {
        this.id_JuegosC = id_JuegosC;
    }

    public Long getId_Juego() {
        return id_Juego;
    }

    public void setId_Juego(Long id_Juego) {
        this.id_Juego = id_Juego;
    }

    public String getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(String id_Usuario) {
        this.id_Usuario = id_Usuario;
    }
}
