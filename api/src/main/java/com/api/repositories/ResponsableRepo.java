package com.api.repositories;

import com.api.entities.Responsable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsableRepo extends JpaRepository<Responsable, Integer> {
}
