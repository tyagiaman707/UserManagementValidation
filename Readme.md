# User-Management-system:
## Frameworks and language used:
-This project is built using Java, with the Spring Boot framework.

-The web framework used in the project is Spring MVC.

## Data Flow:
### Controller-

UserController handles incoming requests from clients

*@PostMapping("/addUser") maps HTTP POST requests onto addUser method and creates a new user in the database

*@GetMapping("/getUser/{userId}") maps HTTP GET requests onto getUser method and retrieves a user from the database by ID

*@GetMapping("/getAllUser") maps HTTP GET requests onto getAllUsers method and retrieves all users from the database

*@PutMapping("/updateUserInfo/{userId}") maps HTTP PUT requests onto updateUserInfo method and updates an existing user's information

*@DeleteMapping("/deleteUser/{userId}") maps HTTP DELETE requests onto deleteUser method and deletes a user from the database by ID


### Services-

UserService contains business logic for handling user operations

*addUser method creates a new user in the database

*getUser method retrieves a user from the database by ID

*getAllUsers method retrieves all users from the database

*updateUserInfo method updates an existing user's information in the database

*deleteUser method deletes a user from the database by ID


### Repository-

UserRepository extends JpaRepository and handles database CRUD operations for User objects



## Data Structure Used in the Project:

Java classes for User and UserRepository

H2 in-memory database with a single table users and columns for each user attribute

## For running the Project:

-Clone this repository

-Navigate to the project root directory in the command line

-Run mvn spring-boot:run to start the Spring Boot server

-Access the H2 Console at http://localhost:8080/h2-console to view and manage the in-memory database

-Access the Swagger UI at http://localhost:8080/swagger-ui.html to interact with the API endpoints

## Project Summary

This is a User Management System built with Java Spring Boot, using an H2 database engine and Maven build tool. Swagger is used for API documentation, and validation is implemented to ensure data integrity. The system supports adding, getting, updating, and deleting users. The project follows the Model-View-Controller (MVC) architecture pattern, with separate layers for controller, service, and repository.
