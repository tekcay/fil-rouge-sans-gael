package com.api.controllers;

import com.api.dto.ThemeDTO;
import jakarta.transaction.Transactional;
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
    private ThemeController themeController;


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