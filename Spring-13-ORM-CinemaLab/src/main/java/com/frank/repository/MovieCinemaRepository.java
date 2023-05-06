package com.frank.repository;

import com.frank.entity.Genre;
import com.frank.entity.MovieCinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface MovieCinemaRepository extends JpaRepository<MovieCinema, Long> {

    // ------------------- DERIVED QUERIES ------------------- //
    //Write a derived query to read movie cinema with id
    Optional<MovieCinema> findById(Long id);

    //Write a derived query to count all movie cinemas with a specific cinema id
    Integer countAllByCinemaId(Long id);

    //Write a derived query to count all movie cinemas with a specific movie id
    Integer countAllByMovieId(Long id);

    //Write a derived query to list all movie cinemas with higher than a specific date
    List<MovieCinema> findAllByDateTimeAfter(LocalDateTime dateTime);

    //Write a derived query to find the top 3 expensive movies
    List<MovieCinema> findFirs3ByOrderByMoviePriceDesc();

    //Write a derived query to list all movies cinemas that contains a specific movie name
    List<MovieCinema> findAllByMovie_NameContaining(String name);

    //Write a derived query to list all movie cinemas in a specific location
    List<MovieCinema> findAllByCinema_Location_Name(String name);


    // ------------------- JPQL QUERIES ------------------- //

    //Write a JPQL query to list all movie cinemas with higher than a specific date



    // ------------------- NATIVE QUERIES ------------------- //

    //Write a native query that returns genres by containing name


}
