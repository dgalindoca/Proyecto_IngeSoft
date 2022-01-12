package com.unal.lizzard.web;


public class Video_JugadoresRegistrationDto {
    private long id_persona;
    private long id_Videojugador;
    private String correo;
    private String  contraseña;
    private String nickname;

    public Video_JugadoresRegistrationDto() {
    }

    public Video_JugadoresRegistrationDto(String correo, String contraseña,String nickname) {
        super();
        this.correo = correo;
        this.contraseña = contraseña;
        this.nickname =nickname;
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

    public String getNickname() {return nickname;}

    public void setNickname(String nickname) {this.nickname = nickname;}

    public long getId_Videojugador() {return id_Videojugador;}

    public void setId_Videojugador(long id_Videojugador) {this.id_Videojugador = id_Videojugador;}
}




