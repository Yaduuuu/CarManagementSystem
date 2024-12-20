# Car Management System

This project is a Spring Boot-based Car Management System with features like CRUD operations, global search, pagination, sorting, and Swagger API documentation.

## Features
- Add, update, delete, and view car details.
- Global search by name, model, year, color, or fuel type.
- Pagination and sorting for efficient data handling.
- Input validation to ensure proper data submission.
- Swagger documentation for exploring and testing APIs.

## Requirements
- **Java 17 or higher**
- **MySQL Server**
- **Maven**

## Setup Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/Yaduuuu/CarManagementSystem.git
   cd CarManagementSystem
   
2. Configure the database:
-Create a database in MySQL:
sql
-CREATE DATABASE car_management_db;
--Update application.properties with your MySQL credentials:
spring.datasource.username=<your-username>
spring.datasource.password=<your-password>

3.Build and run the project:
--mvn clean install
--mvn spring-boot:run

4. Access the application:
--Swagger UI: http://localhost:8080/swagger-ui.html
--API Endpoints: http://localhost:8080/api/cars
