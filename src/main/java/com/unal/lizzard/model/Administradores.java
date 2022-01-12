package com.unal.lizzard.model;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "Administradores")
public class Administradores extends Persona  {

    @Column(name = "id_administrador")
    private Integer id_administrador;

    public Administradores() {
    }

    public Administradores(Integer id_administrador) {
        this.id_administrador = id_administrador;
    }

    public Integer getId_administrador() {
        return id_administrador;
    }

    public void setId_administrador(Integer id_administrador) {
        this.id_administrador = id_administrador;
    }
}

