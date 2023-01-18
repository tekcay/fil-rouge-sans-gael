package com.api.repositories;

import com.api.entities.STheme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SThemeRepo extends JpaRepository<STheme, Integer> {

    Optional<STheme> findById(int id);
    List<STheme> findAll();
}
