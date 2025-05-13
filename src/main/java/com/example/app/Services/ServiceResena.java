package com.example.app.Services;

import com.example.app.exception.PeliculaNoEncontradaExecption;
import com.example.app.models.Pelicula;
import com.example.app.models.Resena;
import com.example.app.repository.RepositoryPelicula;
import com.example.app.repository.RepositoryResena;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceResena {

    @Autowired
    private RepositoryResena repo;
    @Autowired
    private RepositoryPelicula repositoryPelicula;
    public Optional<Resena> agregarResena(Long pelicula_id,Resena resena){

        Optional<Pelicula> pelicula = repositoryPelicula.findById(pelicula_id);
        if(pelicula.isEmpty()){
            throw new PeliculaNoEncontradaExecption();
        }
        resena.setPelicula(pelicula.get());
        return Optional.of(repo.save(resena));
    }
}
