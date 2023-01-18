package com.api.controllers;

import com.api.entities.Theme;
import com.api.repositories.ThemeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/theme-controller")
public class ThemeController {

    @Autowired
    private ThemeRepo themeRepo;

    @GetMapping("/themes")
    public List<Theme> getAllStagiaires() {
        return themeRepo.findAll();
    }

    @GetMapping("/themes/{id}")
    public ResponseEntity<Theme> getThemeById(@PathVariable int id) {
        Theme theme = themeRepo.findById(id).orElseThrow(() -> new RuntimeException("No such Theme with id " + id));
        return ResponseEntity.ok(theme);
    }

    @PostMapping("create-theme")
    public Theme createTheme(@RequestBody Theme theme) {
        return themeRepo.save(theme);
    }


}
