package com.api.controllers;

import com.api.dto.FormationDTO;
import com.api.entities.Formation;
import com.api.entities.Theme;
import com.api.repositories.FormateurRepo;
import com.api.repositories.FormationRepo;
import com.api.repositories.ThemeRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/formation-controller")
public class FormationController {

    @Autowired
    private FormationRepo formationRepo;

    @Autowired
    private FormateurRepo formateurRepo;

    @Autowired
    private ThemeRepo themeRepo;

    @GetMapping("/formations")
    public List<Formation> getAllFormation() {
        return formationRepo.findAll();
    }

    @GetMapping("/formations/{id}")
    public ResponseEntity<FormationDTO> getFormationById(@PathVariable int id) {
        Formation formation = formationRepo.findById(id).orElseThrow(() -> new RuntimeException("No such Formation with id " + id));
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        FormationDTO formationDTO = modelMapper.map(formation, FormationDTO.class);

        return ResponseEntity.ok(formationDTO);
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
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        List<FormationDTO> formationDTOList = formationList
                .stream()
                .map(formation -> modelMapper.map(formation, FormationDTO.class))
                .toList();

        return ResponseEntity.ok(formationDTOList);
    }


    /*
    @GetMapping("/formations/byThemeId/{id}")
    public List<FormationDTO> getFormationByThemeId(@PathVariable int id) {
        List<Formation> formationList = formationRepo.findByThemeId(id);
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        List<FormationDTO> formationDTOList = formationList
                .stream()
                .map(formation -> modelMapper.map(formation, FormationDTO.class))
                .toList();

        return formationDTOList;
    }

     */



    /*
    @GetMapping("/formations/bySThemeId/{id}")
    public ResponseEntity<List<Formation>> getFormationBySThemeId(@PathVariable int id) {
        List<Formation> formationList = formationRepo.findBySThemeId(id).orElseThrow(() -> new RuntimeException("No such Formation with STheme id " + id));
        return ResponseEntity.ok(formationList);
    }

    @GetMapping("/formations/bySsThemeId/{id}")
    public ResponseEntity<List<Formation>> getFormationBySsThemeId(@PathVariable int id) {
        List<Formation> formationList = formationRepo.findBySsThemeId(id).orElseThrow(() -> new RuntimeException("No such Formation with SsTheme id " + id));
        return ResponseEntity.ok(formationList);
    }

     */

    @PostMapping("create-formation")
    public FormationDTO createFormation(@RequestBody FormationDTO formationDTO) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        Integer themeId = formationDTO.getThemeId();
        Theme theme = themeRepo.findById(themeId).orElseThrow(() -> new RuntimeException("No such Theme with id " + themeId));

        Formation formation = modelMapper.map(formationDTO, Formation.class);
        formation.setTheme(theme);
        Formation formationSaved = formationRepo.save(formation);

        return modelMapper.map(formationSaved, FormationDTO.class);
    }


}
