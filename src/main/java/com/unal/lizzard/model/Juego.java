package com.unal.lizzard.model;
import javax.persistence.*;
import java.util.Collection;

@Entity
@Table (name = "Juego")
public class Juego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_Juego;
    @Column(name = "Nombre_Juego")
    private String  nombre_Juego;
    private String  nombre_tienda;
    private String URL;
    /*@ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private User user;
*/
/*
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "biblioteca_juegos",
            joinColumns = @JoinColumn(name = "juego_id", referencedColumnName = "id_Juego"),
            inverseJoinColumns =@JoinColumn(name = "User_id",referencedColumnName ="id")
    )
    private Collection<Juego> juego;

 */




    public Juego() {
    }
    public Juego(String nombre_Juego, String nombre_tienda, String URL) {
        this.nombre_Juego = nombre_Juego;
        this.nombre_tienda = nombre_tienda;
        this.URL = URL;
    }


    public Long getId_Juego() {
        return id_Juego;
    }

    public void setId_Juego(Long id_Juego) {
        this.id_Juego = id_Juego;
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