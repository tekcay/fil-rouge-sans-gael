package com.api.controllers;

import com.api.dto.FormationDTO;
import com.api.entities.Formation;
import com.api.entities.Theme;
import com.api.interfaces.MappingHelper;
import com.api.repositories.FormateurRepo;
import com.api.repositories.FormationRepo;
import com.api.repositories.ThemeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/formation-controller")
public class FormationController implements MappingHelper<FormationDTO, Formation> {

    @Autowired
    private FormationRepo formationRepo;

    @Autowired
    private FormateurRepo formateurRepo;

    @Autowired
    private ThemeRepo themeRepo;

    @GetMapping("/formations")
    public List<FormationDTO> getAllFormation() {
        return mapListToDTO(formationRepo.findAll(), FormationDTO.class);
    }

    @GetMapping("/formations/{id}")
    public ResponseEntity<FormationDTO> getFormationById(@PathVariable int id) {
        Formation formation = formationRepo.findById(id).orElseThrow(() -> new RuntimeException("No such Formation with id " + id));
        return ResponseEntity.ok(mapToDTO(formation, FormationDTO.class));
    }

    /*
    @GetMapping("/formations/{name}")
    public ResponseEntity<Formation> getFormationByName(@PathVariable String name) {
        Formation formation = formationRepo.findByName(name).orElseThrow(() -> new RuntimeException("No such Formation with name " + name));
        return ResponseEntity.ok(formation);
    }

     */


    @GetMapping("/formations/byThemeId/{id}")
    public ResponseEntity<List<FormationDTO>> getFormationByThemeId(@PathVariable int id) {
        List<Formation> formationList = formationRepo.findByThemeId(id).orElseThrow(() -> new RuntimeException("No such Formation with theme id " + id));
        return ResponseEntity.ok(mapListToDTO(formationList, FormationDTO.class));
    }

    @GetMapping("/formations/bySThemeId/{id}")
    public ResponseEntity<List<FormationDTO>> getFormationBySThemeId(@PathVariable int id) {
        List<Formation> formationList = formationRepo.findBysThemesId(id).orElseThrow(() -> new RuntimeException("No such Formation with stheme id " + id));
        return ResponseEntity.ok(mapListToDTO(formationList, FormationDTO.class));
    }

    @GetMapping("/formations/bySsThemeId/{id}")
    public ResponseEntity<List<FormationDTO>> getFormationBySsThemeId(@PathVariable int id) {
        List<Formation> formationList = formationRepo.findByssThemesId(id).orElseThrow(() -> new RuntimeException("No such Formation with sstheme id " + id));
        return ResponseEntity.ok(mapListToDTO(formationList, FormationDTO.class));
    }

    @PostMapping("create-formation")
    public FormationDTO createFormation(@RequestBody FormationDTO formationDTO) {

        Integer themeId = formationDTO.getThemeId();
        Theme theme = themeRepo.findById(themeId).orElseThrow(() -> new RuntimeException("No such Theme with id " + themeId));

        Formation formation = reverseMapToDTO(formationDTO, Formation.class);
        formation.setTheme(theme);
        Formation formationSaved = formationRepo.save(formation);

        return mapToDTO(formationSaved, FormationDTO.class);
    }


}
