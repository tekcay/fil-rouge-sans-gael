package com.api.repositories;

import com.api.entities.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StagiaireRepo extends JpaRepository<Stagiaire, Integer> {
    Optional<Stagiaire> findById(int id);
}
