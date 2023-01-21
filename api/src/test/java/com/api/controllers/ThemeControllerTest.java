package com.api.controllers;

import com.api.dto.ThemeDTO;
import com.api.entities.Theme;
import com.api.repositories.ThemeRepo;
import jakarta.transaction.Transactional;
import org.jboss.jandex.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
class ThemeControllerTest {

    @Autowired
    private ThemeRepo themeRepo;

    @Autowired
    private ThemeController themeController;


    @Test
    //@Sql(scripts = {"/scripts/data.sql"}, executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
    //@Sql(statements = "INSERT INTO theme (name, s_theme, formationList) VALUES ('Theme', NULL, NULL)")
    void findByIdOne() {
        Theme theme = new Theme();
        theme.setName("Theme");
        theme.setId(1);
        Theme retrievedTheme = themeRepo.findById(1).orElseThrow();
        assertEquals(theme, retrievedTheme);
    }

    @DisplayName("Test getById() method")
    @Test
    //@Sql(scripts = {"classpath:scripts/data.sql"}, executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
    @Sql(statements = "INSERT INTO theme (id_theme, name) VALUES (2, 'Theme2')")
    void getByIdTwo() {
        ThemeDTO themeDTO = new ThemeDTO();
        themeDTO.setName("Theme2");
        themeDTO.setId(2);

        ResponseEntity<ThemeDTO> themeDTOResponseEntity = themeController.getThemeById(2);

        assertEquals(ResponseEntity.ok(themeDTO), themeDTOResponseEntity);
    }
}