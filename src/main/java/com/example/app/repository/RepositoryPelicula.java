package com.example.app.repository;

import com.example.app.models.Director;
import com.example.app.models.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface RepositoryPelicula extends JpaRepository<Pelicula,Long> {
    List<Pelicula> findByDirector(Director director);
}
