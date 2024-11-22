package com.example.fitness.repository;

import com.example.fitness.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

// Almost default user repository, just need a method to find users by username but is still JPA default
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    boolean existsByRole(String role);
}
