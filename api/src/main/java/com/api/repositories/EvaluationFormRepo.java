package com.api.repositories;

import com.api.entities.EvaluationForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EvaluationFormRepo extends JpaRepository<EvaluationForm, Integer> {
}
