package com.api.controllers;

import com.api.dto.ThemeDTO;
import com.api.entities.Theme;
import com.api.repositories.ThemeRepo;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
class ThemeControllerTest {

    @Autowired
    private ThemeController themeController;

    @Autowired
    private ThemeRepo themeRepo;


    @DisplayName("Test getById() method find id = 2")
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

    @DisplayName("Test getAllThemes() method")
    @Test
    @Sql(statements = "INSERT INTO theme (id_theme, name) VALUES (1, 'Theme1'), (2, 'Theme2'), (3, 'Theme3')")
    void getAll() {
        List<ThemeDTO> themeDTOList = new ArrayList<>();

        for (int i = 1; i < 4; i++) {
            Theme theme = new Theme();
            theme.setId(i);
            theme.setName("Theme" + i);
            themeDTOList.add(themeController.mapToDTO(theme, ThemeDTO.class));
        }
        assertEquals(themeDTOList, themeController.getAllThemes());
    }

    @DisplayName("Test theme creation")
    @Test
    void createThemeWithEmptySThemes() {
        ThemeDTO themeDTO = new ThemeDTO(1, "theme");
        assertTrue(themeController.createTheme(themeDTO));
        Theme expectedTheme = new Theme();
        expectedTheme.setId(1);
        expectedTheme.setName("theme");

        Theme actualTheme = themeRepo.findById(1).orElseThrow();

        assertEquals(expectedTheme, actualTheme);
    }
}