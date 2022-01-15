package com.unal.lizzard.model;

import java.util.Collection;
import java.util.Set;
import javax.persistence.*;



@Entity
@Table (name = "Tienda")
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_tienda;
    @Column(name = "nombre_tienda")
    private String  nombre_tienda;
    private String URL;
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "biblioteca_juegos",
            joinColumns = @JoinColumn(name = "tienda_id", referencedColumnName = "id_tienda"),
            inverseJoinColumns =@JoinColumn(name = "juego_id",referencedColumnName ="id_Juego")
    )

    private Collection<Juego> juego;

    public Tienda() {
    }

    public Tienda(String nombre_tienda, String URL) {
        this.nombre_tienda = nombre_tienda;
        this.URL = URL;
        this.juego = juego;
    }

    public long getId_tienda() {
        return id_tienda;
    }

    public void setId_tienda(long id_tienda) {
        this.id_tienda = id_tienda;
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

    public Collection<Juego> getJuego() {
        return juego;
    }

    public void setJuego(Collection<Juego> juego) {
        this.juego = juego;
    }


}
