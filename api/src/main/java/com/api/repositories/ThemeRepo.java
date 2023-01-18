package com.api.repositories;

import com.api.entities.Theme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ThemeRepo extends JpaRepository<Theme, Integer> {

    Optional<Theme> findById(int id);

}
