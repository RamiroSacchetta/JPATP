package com.example.app.models;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "actor")
public class Actor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String nombre;
    private String nacionalidad;

    @ManyToMany(mappedBy = "Actores")
    private List<Pelicula> peliculas= new ArrayList<>();
}

