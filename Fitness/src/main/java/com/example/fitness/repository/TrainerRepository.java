package com.example.fitness.repository;

import com.example.fitness.model.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;

// Default trainer repository, didn't need to add any extra methods
public interface TrainerRepository extends JpaRepository<Trainer, Long> {
}
