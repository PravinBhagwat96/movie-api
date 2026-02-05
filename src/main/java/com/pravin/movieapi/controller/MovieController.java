package com.pravin.movieapi.controller;

import com.pravin.movieapi.model.Movie;
import com.pravin.movieapi.service.MovieService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    // Requirement: Add a new item
    @PostMapping("/add")
    public ResponseEntity<Movie> addMovie(@Valid @RequestBody Movie movie) {
        return ResponseEntity.ok(movieService.addMovie(movie));
    }

    // Requirement: Get a single item by ID
    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovie(@PathVariable Long id) {
        return movieService.getMovieById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}
