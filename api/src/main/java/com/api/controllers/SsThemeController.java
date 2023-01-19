package com.api.controllers;

import com.api.dto.SsThemeDTO;
import com.api.entities.SsTheme;
import com.api.helpers.MappingHelper;
import com.api.repositories.SsThemeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/sstheme-controller")
public class SsThemeController implements MappingHelper<SsThemeDTO, SsTheme> {

    @Autowired
    private SsThemeRepo ssThemeRepo;

    @GetMapping("/ssthemes")
    public List<SsThemeDTO> getAllSsThemes() {
        return mapListToDTO(ssThemeRepo.findAll(), SsThemeDTO.class);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<SsThemeDTO> getSsThemeById(@PathVariable int id) {
        SsTheme sstheme = ssThemeRepo.findById(id).orElseThrow(() -> new RuntimeException("No such Sous sous Theme with id " + id));
        return ResponseEntity.ok(mapToDTO(sstheme, SsThemeDTO.class));
    }

    @PostMapping("/create-sstheme")
    public SsTheme createTheme(@RequestBody SsTheme sstheme) {
        return ssThemeRepo.save(sstheme);
    }


}
