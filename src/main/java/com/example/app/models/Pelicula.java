package com.example.app.models;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.NotFound;
import org.springframework.lang.NonNull;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes;

@Entity
@Table(name = "Pelicula")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true,nullable = false)
    @NotNull
    private String title;

    @NotNull
    private Integer ano_estreno;

    private Float duracion;

    @ManyToOne
    @JoinColumn(name = "principal_genero_id")
    private Genero principalGenero;

    @ManyToMany
    @JoinTable(name = "Genero_secundario",
               joinColumns = @JoinColumn(name = "pelicula_id"),
     inverseJoinColumns = @JoinColumn(name = "secundario_genero_id"))
    private List<Genero> generos = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "Actor_pelicula",
            joinColumns = @JoinColumn(name = "pelicula_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id"))
    private List<Actor> actors = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "directores")
    private Director director;

    @OneToMany(mappedBy = "pelicula",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Resena> resenas = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getAno_estreno() {
        return ano_estreno;
    }

    public void setAno_estreno(Integer ano_estreno) {
        this.ano_estreno = ano_estreno;
    }

    public Float getDuracion() {
        return duracion;
    }

    public void setDuracion(Float duracion) {
        this.duracion = duracion;
    }

    public Genero getPrincipalGenero() {
        return principalGenero;
    }

    public void setPrincipalGenero(Genero principalGenero) {
        this.principalGenero = principalGenero;
    }

    public List<Genero> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Resena> getResenas() {
        return resenas;
    }

    public void setResenas(List<Resena> resenas) {
        this.resenas = resenas;
    }
}
