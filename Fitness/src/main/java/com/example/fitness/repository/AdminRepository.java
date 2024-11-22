package com.example.fitness.repository;

import com.example.fitness.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

// Default admin repository, didn't need to add any extra methods
public interface AdminRepository extends JpaRepository<Admin, Long> {
}
