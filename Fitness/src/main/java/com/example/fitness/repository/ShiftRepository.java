package com.example.fitness.repository;

import com.example.fitness.model.Shift;
import org.springframework.data.jpa.repository.JpaRepository;

// Default shift repository, didn't need to add any extra methods
public interface ShiftRepository extends JpaRepository<Shift, Long> {
}
