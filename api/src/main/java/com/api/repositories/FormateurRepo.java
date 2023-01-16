package com.api.repositories;

import com.api.entities.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormateurRepo extends JpaRepository<Formateur, Integer> {
}
