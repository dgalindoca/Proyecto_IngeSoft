package com.unal.lizzard.web;


public class GameRegistrationDto {
    private String  nombre_Juego;
    private String  nombre_tienda;
    private String URL;
    public GameRegistrationDto() {

    }

    public GameRegistrationDto(String nombre_Juego, String nombre_tienda, String URL) {
        this.nombre_Juego = nombre_Juego;
        this.nombre_tienda = nombre_tienda;
        this.URL = URL;
    }

    public String getNombre_Juego() {
        return nombre_Juego;
    }

    public void setNombre_Juego(String nombre_Juego) {
        this.nombre_Juego = nombre_Juego;
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
