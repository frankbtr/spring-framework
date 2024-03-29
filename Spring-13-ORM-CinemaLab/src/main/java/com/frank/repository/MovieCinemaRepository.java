package com.frank.repository;

import com.frank.entity.Genre;
import com.frank.entity.MovieCinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

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
    @Query("SELECT mc FROM MovieCinema mc WHERE mc.dateTime >?!")
    List<MovieCinema> fetchAllWithHigherThanSpecificDate(@Param("dateTime") LocalDateTime dateTime);


    // ------------------- NATIVE QUERIES ------------------- //
    //Write a native query to list all movies cinemas that contains a specific cinema id
    @Query(value = "SELECT COUNT(*) FROM movie_cinema WHERE cinema_id - ?!", nativeQuery = true)
    List<MovieCinema> countByCinemaId(@Param("id") Long id);

    //Write a native query returns list all movies cinemas by location name
    @Query(value = "SELECT * FROM movie_cinema mc JOIN cinema c " +
            "ON mc.cinema_id = c.id JOIN location l ON c.location_id = l.id " +
            "WHERE  l.name = ?1 ", nativeQuery = true)
    List<MovieCinema> retrieveAllByLocationName(@Param("name") String name);
}
