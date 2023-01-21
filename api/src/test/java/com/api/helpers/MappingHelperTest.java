package com.api.helpers;

import com.api.controllers.ThemeController;
import com.api.dto.ThemeDTO;
import com.api.entities.Theme;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MappingHelperTest {

    @Test
    void shouldThemeDTOUnMappedToTheme() {

        ThemeController themeController = new ThemeController();

        ThemeDTO themeDTO = new ThemeDTO(1, "Programmation");
        Theme theme = new Theme();
        theme.setName("Programmation");
        theme.setId(1);

        Theme convertedTheme = themeController.unMapDTO(themeDTO, Theme.class);

        assertEquals(theme, convertedTheme);
        assertEquals(theme.getSThemes(), convertedTheme.getSThemes());
    }

}