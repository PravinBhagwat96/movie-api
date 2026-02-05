# Movie Management API - Java Backend

### Project Overview
A simple Java backend application built with Spring Boot that manages a collection of movies using an in-memory `ArrayList` data store.

### Features
* **RESTful API**: Endpoints to add and retrieve movies.
* **In-Memory Storage**: Uses `ArrayList` for data management.
* **Validation**: Ensures movie names and descriptions are provided.
* **Documentation**: Integrated Swagger UI for easy testing.

### How to Run
1. Ensure Java 17+ and Maven are installed.
2. Run the application via IntelliJ or use command: `./mvnw spring-boot:run`
3. The server runs on port **8081**.

### API Endpoints
* **POST** `/api/movies/add`: Add a new movie.
* **GET** `/api/movies/{id}`: Retrieve a movie by its unique ID.

### Swagger UI
View and test the API at: `http://localhost:8081/swagger-ui/index.html`