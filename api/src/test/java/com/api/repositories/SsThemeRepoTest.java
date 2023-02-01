package com.api.repositories;

import com.api.entities.SsTheme;
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

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
class SsThemeRepoTest {

    @Autowired
    private SsThemeRepo ssThemeRepo;

    @Test
    @DisplayName("Find a SsTheme by id = 1 with empty theme, ssthemes and formationList fields")
    @Sql(statements = "INSERT INTO sstheme (id_sstheme, name) VALUES (1, 'sous sous theme')")
    void findByIdOne() {
        SsTheme ssTheme = new SsTheme();
        ssTheme.setId(1);
        ssTheme.setName("sous sous theme");
        ssTheme.setSThemeList(new ArrayList<>());
        ssTheme.setFormations(new ArrayList<>());

        SsTheme retrievedSsTheme = ssThemeRepo.findById(1).orElseThrow();
        assertEquals(ssTheme, retrievedSsTheme);
    }

    @Test
    @DisplayName("Find all STheme with empty theme, ssthemes and formationList fields")
    @Sql(statements = "INSERT INTO sstheme (id_sstheme, name) VALUES (1, 'sous sous theme 1'), (2, 'sous sous theme 2'), (3, 'sous sous theme 3')")
    void findAllEmpty() {

        List<SsTheme> ssThemeList = new ArrayList<>();

        for (int i = 1; i < 4; i++) {
            SsTheme ssTheme = new SsTheme();
            ssTheme.setId(i);
            ssTheme.setName("sous sous theme " + i);
            ssTheme.setSThemeList(new ArrayList<>());
            ssTheme.setFormations(new ArrayList<>());
            ssThemeList.add(ssTheme);
        }

        List<SsTheme> retrievedSThemeList = ssThemeRepo.findAll();
        assertEquals(ssThemeList, retrievedSThemeList);
    }

}