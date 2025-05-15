package com.example.app.Controllers;

import com.example.app.Services.ServicePelicula;
import com.example.app.exception.PeliculaNoEncontradaExecption;
import com.example.app.models.Pelicula;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {

    @Autowired
    private ServicePelicula service;


    @PostMapping()
    public ResponseEntity<Pelicula> handlerCreatepelicula(@Valid @RequestBody Pelicula pelicula){
        Pelicula saved = service.createPelicula(pelicula);

        return ResponseEntity.status(HttpStatus.CREATED).body(saved);
    }

    @GetMapping()
    public ResponseEntity<?> handlerGetallPeliculas(){
        List<Pelicula> peliculas = service.getAllPeliculas();
        if(peliculas.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(peliculas);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> handlerPeliculaByid(@PathVariable Long id){
        Optional<Pelicula> saved = service.getPeliculaByid(id);
        if(saved.isEmpty()){
            throw new PeliculaNoEncontradaExecption();
        }
        return ResponseEntity.ok(saved);
    }




}
