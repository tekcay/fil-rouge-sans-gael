package com.api.repositories;

import com.api.entities.SsTheme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SsThemeRepo extends JpaRepository<SsTheme, Integer> {

    Optional<SsTheme> findById(int id);
    List<SsTheme> findAll();
}
