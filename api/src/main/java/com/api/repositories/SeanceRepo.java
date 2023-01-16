package com.api.repositories;

import com.api.entities.Seance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeanceRepo extends JpaRepository<Seance, Integer> {
}
