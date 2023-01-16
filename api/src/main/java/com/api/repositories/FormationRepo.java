package com.api.repositories;

import com.api.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormationRepo extends JpaRepository<Formation, Integer> {
}
