package com.example.app.Services;

import com.example.app.exception.PeliculaNoEncontradaExecption;
import com.example.app.models.Pelicula;
import com.example.app.models.Resena;
import com.example.app.repository.RepositoryPelicula;
import com.example.app.repository.RepositoryResena;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicePelicula {

    @Autowired
    private RepositoryPelicula repo;
    @Autowired
    private RepositoryResena repositoryResena;
    public Pelicula createPelicula(Pelicula pelicula){
        return repo.save(pelicula);

    }

    public List<Pelicula> buscarPeliculasPorDirector (String director_n){
        List<Pelicula> peliculas = repo.findByDirector(director_n);
        if(peliculas.isEmpty()){
            throw new PeliculaNoEncontradaExecption();
        }
        return peliculas;
    }


}
