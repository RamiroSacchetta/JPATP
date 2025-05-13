package com.example.app.models;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "Director")
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    @NotNull
    private String nombre;

    @OneToMany(mappedBy = "director")
    private Pelicula pelicula;


}
