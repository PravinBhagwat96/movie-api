package com.pravin.movieapi.service;

import com.pravin.movieapi.model.Movie;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    // This is the "In-Memory" storage Mahesh asked for
    private final List<Movie> movieList = new ArrayList<>();
    private Long nextId = 1L;

    public Movie addMovie(Movie movie) {
        movie.setId(nextId++); // Auto-incrementing the ID
        movieList.add(movie);
        return movie;
    }

    public Optional<Movie> getMovieById(Long id) {
        // Finding the movie in the ArrayList using Java Streams
        return movieList.stream()
                .filter(movie -> movie.getId().equals(id))
                .findFirst();
    }
}