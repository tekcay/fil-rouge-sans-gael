package com.api.repositories;

import com.api.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Integer> {

    Optional<User> findById(int id);
    Optional<User> findByRole(String role);

}
