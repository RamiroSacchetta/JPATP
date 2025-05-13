package com.example.app.models;

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

    @OneToMany(mappedBy = "Genero_Principal")
    private List<Pelicula> peliculasPrincipal;

    @ManyToMany(mappedBy = "Genero_Secundiarios")
    private List<Pelicula> peliculasSecundarias;



}
