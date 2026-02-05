package com.pravin.movieapi.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Movie {
    private Long id;

    @NotBlank(message = "Movie name is required")
    private String name;

    @NotBlank(message = "Description is required")
    private String description;

    private String genre;

    // No-argument constructor (Required by Spring)
    public Movie() {}

    // Getters and Setters (How Java accesses your data)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }
}