package com.unal.lizzard.model;

public class Compra {
    private Long id_JuegosC;
    private Long id_Juego;
    private String nombre_juego;
    private String nombre_tienda;
    private String URL;

    public Compra(){

    }

    public Compra(Long id_JuegosC, Long id_Juego, String nombre_juego, String nombre_tienda, String URL) {
        this.id_JuegosC = id_JuegosC;
        this.id_Juego = id_Juego;
        this.nombre_juego = nombre_juego;
        this.nombre_tienda = nombre_tienda;
        this.URL = URL;
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

    public String getNombre_juego() {
        return nombre_juego;
    }

    public void setNombre_juego(String nombre_juego) {
        this.nombre_juego = nombre_juego;
    }

    public String getNombre_tienda() {
        return nombre_tienda;
    }

    public void setNombre_tienda(String nombre_tienda) {
        this.nombre_tienda = nombre_tienda;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
