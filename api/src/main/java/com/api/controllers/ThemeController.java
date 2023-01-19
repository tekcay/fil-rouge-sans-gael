package com.api.controllers;

import com.api.dto.ThemeDTO;
import com.api.entities.Theme;
import com.api.helpers.MappingHelper;
import com.api.repositories.ThemeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/theme-controller")
public class ThemeController implements MappingHelper<ThemeDTO, Theme> {

    @Autowired
    private ThemeRepo themeRepo;

    @GetMapping("/themes")
    public List<ThemeDTO> getAllThemes() {
        return mapListToDTO(themeRepo.findAll(), ThemeDTO.class);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<ThemeDTO> getThemeById(@PathVariable int id) {
        Theme theme = themeRepo.findById(id).orElseThrow(() -> new RuntimeException("No such Theme with id " + id));
        return ResponseEntity.ok(mapToDTO(theme, ThemeDTO.class));
    }

    @PostMapping("/create-theme")
    public boolean createTheme(@RequestBody ThemeDTO themeDTO) {
        themeRepo.save(unMapDTO(themeDTO, Theme.class));
        return true;
    }


}
