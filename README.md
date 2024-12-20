# Car Management System

A Spring Boot-based API for managing car details, with features like CRUD operations, global search, pagination, sorting, validation, and API documentation using Swagger.

## Features
- **CRUD Operations**: Add, update, view, and delete car details.
- **Global Search**: Search cars by name, model, year, color, or fuel type.
- **Pagination & Sorting**: Handle large datasets efficiently.
- **Input Validation**: Ensures only valid data is processed.
- **Swagger Documentation**: Explore and test APIs directly via Swagger UI.

---

## Technologies Used
- **Backend**: Spring Boot, Java 17
- **Database**: MySQL
- **Build Tool**: Maven
- **API Documentation**: Swagger/OpenAPI

---

## Requirements
- Java Development Kit (JDK) 17 or higher
- MySQL Server
- Maven (optional, if Maven Wrapper is used)
- A web browser or API testing tool (e.g., Postman)

---

## Setup Instructions

### 1. Clone the Repository
```bash
git clone https://github.com/Yaduuuu/CarManagementSystem.git
cd CarManagementSystem
2. Configure the Database
Open your MySQL client or MySQL Workbench.
Create a new database:
sql
Copy code
CREATE DATABASE car_management_db;
Update the database credentials in src/main/resources/application.properties:
properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/car_management_db
spring.datasource.username=<your-mysql-username>
spring.datasource.password=<your-mysql-password>
