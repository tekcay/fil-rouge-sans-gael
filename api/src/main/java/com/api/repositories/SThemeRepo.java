package com.api.repositories;

import com.api.entities.SsTheme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SThemeRepo extends JpaRepository<SsTheme, Integer> {

    Optional<SsTheme> findById(int id);
}
