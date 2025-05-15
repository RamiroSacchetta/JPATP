package com.example.app.Controllers;

import com.example.app.Services.ServiceResena;
import com.example.app.exception.PeliculaNoEncontradaExecption;
import com.example.app.models.Resena;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController


public class ResenaController {

    @Autowired
    private ServiceResena service;


    @PostMapping("/peliculas/{id}/resena")
    public ResponseEntity<Optional<Resena>> handlerCreateResena(@Valid @RequestBody Resena resena, @PathVariable Long id) {
        Optional<Resena> resena1 = service.agregarResena(id, resena);
        return ResponseEntity.status(HttpStatus.CREATED).body(resena1);
    }

}
