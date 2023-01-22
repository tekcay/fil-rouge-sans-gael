package com.api.repositories;

import com.api.entities.Theme;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
class ThemeRepoTest {

    @Autowired
    private ThemeRepo themeRepo;

    @Test
    @Sql(statements = "INSERT INTO theme (id_theme, name) VALUES (2, 'Theme2')")
    void findByIdOne() {
        Theme theme = new Theme();
        theme.setName("Theme");
        theme.setId(1);
        Theme retrievedTheme = themeRepo.findById(1).orElseThrow();
        assertEquals(theme, retrievedTheme);
    }

}