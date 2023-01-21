package com.api.controllers;

import com.api.dto.ThemeDTO;
import com.api.repositories.ThemeRepo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class ThemeControllerTest {

    @Autowired
    private ThemeRepo themeRepo;


    @Test
    //@Sql(scripts = {"/scripts/data.sql"}, executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
    void getByIdOne() {

    }
}