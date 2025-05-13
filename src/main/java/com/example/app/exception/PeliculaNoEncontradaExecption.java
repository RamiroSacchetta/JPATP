package com.example.app.exception;

public class PeliculaNoEncontradaExecption extends RuntimeException{
    public PeliculaNoEncontradaExecption() {
        super("Pelicula no encotrada ");
    }
}
