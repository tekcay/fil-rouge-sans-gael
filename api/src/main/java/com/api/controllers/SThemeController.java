package com.api.controllers;

import com.api.dto.SThemeDTO;
import com.api.entities.STheme;
import com.api.helpers.MappingHelper;
import com.api.repositories.SThemeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/stheme-controller")
public class SThemeController implements MappingHelper<SThemeDTO, STheme> {

    @Autowired
    private SThemeRepo sThemeRepo;

    @GetMapping("/sthemes")
    public List<SThemeDTO> getAllSThemes() {
        return mapListToDTO(sThemeRepo.findAll(), SThemeDTO.class);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<SThemeDTO> getSThemeById(@PathVariable int id) {
        STheme stheme = sThemeRepo.findById(id).orElseThrow(() -> new RuntimeException("No such sous Theme with id " + id));
        return ResponseEntity.ok(mapToDTO(stheme, SThemeDTO.class));
    }

    @PostMapping("/create-stheme")
    public STheme createTheme(@RequestBody STheme stheme) {
        return sThemeRepo.save(stheme);
    }


}
