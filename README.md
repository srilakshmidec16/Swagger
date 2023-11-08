# Swagger
# Spring Boot User API with Swagger

This is a simple Spring Boot application that provides User API endpoints for creating, retrieving, listing, and deleting users. The project uses Swagger for API documentation and testing.
It gives self-explanatory information about all APIs developed / available
Easy to use for testing
Provides more description to use APis than postman
Clean user interface for Apis
We can generate swagger/api documentation easily

## Getting Started

1. Clone this repository or create a new Spring Boot project with the specified dependencies.

2. Build and run the project using your preferred IDE or by running `./mvnw spring-boot:run` in the project directory.

3. Access the Swagger UI documentation at [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) to test the user APIs.

## API Endpoints

- *Create User:*
  - POST `/users` with a JSON payload containing user data.

- *Get User by ID:*
  - GET `/users/{id}` to retrieve a user by their ID.

- *Get All Users:*
  - GET `/users` to retrieve a list of all users.

- *Delete User by ID:*
  - DELETE `/users/{id}` to delete a user by their ID.

## Data Storage

This application does not use a database and stores user data in memory. Restarting the server will reset the user data.
