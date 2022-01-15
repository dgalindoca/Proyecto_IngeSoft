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
    private String  Nombre_tienda;
    private String URL;
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private User user;

    public Juego() {
    }

    public Juego(String nombre_Juego, String nombre_tienda, String URL, User user) {
        Nombre_Juego = nombre_Juego;
        Nombre_tienda = nombre_tienda;
        this.URL = URL;
        this.user = user;
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

    public String getNombre_tienda() {
        return Nombre_tienda;
    }

    public void setNombre_tienda(String nombre_tienda) {
        Nombre_tienda = nombre_tienda;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}