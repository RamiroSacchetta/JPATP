package com.example.app.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import org.antlr.v4.runtime.misc.NotNull;
import org.hibernate.annotations.AnyDiscriminator;

@Entity
@Table(name = "Resena")
public class Resena {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String comentario;
    @Min(value = 1, message = "Tiene que ser mayor a 5")
    @Max(value = 5, message = "Tiene que ser menor a 5")
    private Integer puntuacion;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pelicula_id")
    @JsonIgnore
    private Pelicula pelicula;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }
}
