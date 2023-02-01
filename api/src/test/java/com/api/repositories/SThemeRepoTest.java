package com.api.repositories;

import com.api.entities.STheme;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
class SThemeRepoTest {

    @Autowired
    private SThemeRepo sThemeRepo;

    @Test
    @DisplayName("Find a STheme by id = 1 with empty theme, ssthemes and formationList fields")
    @Sql(statements = "INSERT INTO s_theme (id_s_theme, name) VALUES (1, 'sous theme')")
    void findByIdOne() {
        STheme sTheme = new STheme();
        sTheme.setId(1);
        sTheme.setName("sous theme");
        sTheme.setSsThemes(new ArrayList<>());
        sTheme.setFormations(new ArrayList<>());

        STheme retrievedSTheme = sThemeRepo.findById(1).orElseThrow();
        assertEquals(sTheme, retrievedSTheme);
    }

    @Test
    @DisplayName("Find all STheme with empty theme, ssthemes and formationList fields")
    @Sql(statements = "INSERT INTO s_theme (id_s_theme, name) VALUES (1, 'sous theme 1'), (2, 'sous theme 2'), (3, 'sous theme 3')")
    void findAllEmpty() {

        List<STheme> sThemeList = new ArrayList<>();

        for (int i = 1; i < 4; i++) {
            STheme sTheme = new STheme();
            sTheme.setId(i);
            sTheme.setName("sous theme " + i);
            sTheme.setSsThemes(new ArrayList<>());
            sTheme.setFormations(new ArrayList<>());
            sThemeList.add(sTheme);
        }

        List<STheme> retrievedSThemeList = sThemeRepo.findAll();
        assertEquals(sThemeList, retrievedSThemeList);
    }

}