package com.example.carmanagement.repository;

import com.example.carmanagement.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    @Query("SELECT c FROM Car c WHERE " +
           "LOWER(c.name) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
           "LOWER(c.model) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
           "CAST(c.year AS string) LIKE CONCAT('%', :keyword, '%') OR " +
           "LOWER(c.color) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
           "LOWER(c.fuelType) LIKE LOWER(CONCAT('%', :keyword, '%'))")
    List<Car> globalSearch(@Param("keyword") String keyword);
}
