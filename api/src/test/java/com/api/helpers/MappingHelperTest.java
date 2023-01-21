package com.api.helpers;

import com.api.controllers.FormationController;
import com.api.controllers.SThemeController;
import com.api.controllers.ThemeController;
import com.api.dto.FormationDTO;
import com.api.dto.SThemeDTO;
import com.api.dto.ThemeDTO;
import com.api.entities.Formation;
import com.api.entities.STheme;
import com.api.entities.SsTheme;
import com.api.entities.Theme;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    void shouldSThemeDTOUnMappedToSTheme() {

        SThemeController sThemeController = new SThemeController();

        SThemeDTO sThemeDTO = new SThemeDTO("Name");

        STheme sTheme = new STheme();
        sTheme.setName("Name");
        sTheme.setId(1);

        STheme convertedSTheme = sThemeController.unMapDTO(sThemeDTO, STheme.class);

        assertEquals(sTheme, convertedSTheme);
    }

    @Test
    void shouldFormationDTOUnMappedToFormation() {
        FormationController formationController = new FormationController();
        List<Integer> sThemesId = new ArrayList<>(){{add(1);}};
        List<Integer> ssThemesId = new ArrayList<>(){{add(1);}};

        STheme sTheme = new STheme();
        sTheme.setId(1);
        List<STheme> sThemeList = new ArrayList<>(){{add(sTheme);}};

        SsTheme ssTheme = new SsTheme();
        ssTheme.setId(1);
        List<SsTheme> ssThemeList = new ArrayList<>(){{add(ssTheme);}};

        FormationDTO formationDTO = new FormationDTO("Formation", "description", 1, sThemesId, ssThemesId);
        Formation convertedFormation = formationController.unMapDTO(formationDTO, Formation.class);

        Formation formation = new Formation();
        formation.setName("Formation");
        formation.setDescription("description");
        formation.setSThemes(sThemeList);
        formation.setSsThemes(ssThemeList);

        assertEquals(formation, convertedFormation);
    }

}