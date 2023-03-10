package com.api.repositories;

import com.api.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FormationRepo extends JpaRepository<Formation, Integer> {
    Optional<Formation> findById(int id);
    Optional<Formation> findByName(String name);
    Optional<List<Formation>> findByThemeId(int id);
    Optional<List<Formation>> findBysThemesId(int id);
    Optional<List<Formation>> findByssThemesId(int id);
    void deleteById(int id);
    //boolean update(int id);

}
