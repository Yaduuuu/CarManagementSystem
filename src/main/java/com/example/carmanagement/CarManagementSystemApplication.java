package com.example.carmanagement;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
    info = @Info(
        title = "Car Management System API",
        version = "1.0",
        description = "API for managing cars, including CRUD operations, search, pagination, and sorting."
    )
)
public class CarManagementSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(CarManagementSystemApplication.class, args);
    }
}
