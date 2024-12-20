package com.example.carmanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


@Entity
public class Car {
	@Schema(description = "Unique identifier of the car", example = "1", required = true)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Schema(description = "Name of the car", example = "Toyota Corolla", required = true)
    @NotNull(message = "Name cannot be null")
    @Size(min = 1, max = 100, message = "Name must be between 1 and 100 characters")
    private String name;

    @Schema(description = "Model of the car", example = "LE", required = true)
    @NotNull(message = "Model cannot be null")
    @Size(min = 1, max = 100, message = "Model must be between 1 and 100 characters")
    private String model;

    @Schema(description = "Year of manufacturing", example = "2021", required = true)
    @NotNull(message = "Year cannot be null")
    @Min(value = 1886, message = "Year must be no earlier than 1886")
    @Max(value = 2100, message = "Year must be no later than 2100")
    private Integer year;

    @Schema(description = "Price of the car", example = "20000", required = true)
    @NotNull(message = "Price cannot be null")
    @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0")
    private Double price;

    @Schema(description = "Color of the car", example = "Blue", required = true)
    @NotNull(message = "Color cannot be null")
    private String color;

    @Schema(description = "Fuel type of the car", example = "Petrol", required = true)
    @NotNull(message = "Fuel Type cannot be null")
    private String fuelType;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) { // Add this method
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
