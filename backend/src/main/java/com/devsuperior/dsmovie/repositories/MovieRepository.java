package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.Movie;

//responsável por acessar Filmes do BD:
public interface MovieRepository extends JpaRepository<Movie, Long> {

}
