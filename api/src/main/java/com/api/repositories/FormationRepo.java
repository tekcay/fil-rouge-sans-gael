package com.api.repositories;

import com.api.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FormationRepo extends JpaRepository<Formation, Integer> {
    Optional<Formation> findById(int id);
    Optional<Formation> findByName(String name);
}
