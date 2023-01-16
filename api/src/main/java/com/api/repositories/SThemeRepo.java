package com.api.repositories;

import com.api.entities.SsTheme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SThemeRepo extends JpaRepository<SsTheme, Integer> {
}
