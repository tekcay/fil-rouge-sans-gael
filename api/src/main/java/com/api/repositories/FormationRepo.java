package com.api.repositories;

import com.api.dto.FormationDTO;
import com.api.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FormationRepo extends JpaRepository<Formation, Integer> {
    Optional<Formation> findById(int id);
    List<Formation> findAll();
    Optional<Formation> findByName(String name);
    Optional<List<Formation>> findByThemeId(int id);
    Optional<List<Formation>> findBysThemesId(int id);
    Optional<List<Formation>> findByssThemesId(int id);
    boolean deleteById(int id);

}
