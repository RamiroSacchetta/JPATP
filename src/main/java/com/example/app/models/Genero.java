package com.example.app.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.lang.NonNull;

import java.util.List;

@Entity
@Table(name = "Genero")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    @NotNull
    private String nombre;

    @OneToMany(mappedBy = "principalGenero")
    @JsonIgnore
    private List<Pelicula> peliculasPrincipal;

    @ManyToMany(mappedBy = "generos")
    @JsonIgnore
    private List<Pelicula> peliculasSecundarias;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pelicula> getPeliculasPrincipal() {
        return peliculasPrincipal;
    }

    public void setPeliculasPrincipal(List<Pelicula> peliculasPrincipal) {
        this.peliculasPrincipal = peliculasPrincipal;
    }

    public List<Pelicula> getPeliculasSecundarias() {
        return peliculasSecundarias;
    }

    public void setPeliculasSecundarias(List<Pelicula> peliculasSecundarias) {
        this.peliculasSecundarias = peliculasSecundarias;
    }
}
