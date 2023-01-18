package com.api.controllers;

import com.api.dto.FormationDTO;
import com.api.entities.Formation;
import com.api.entities.STheme;
import com.api.entities.SsTheme;
import com.api.entities.Theme;

import com.api.helpers.ListFieldRetrieverHelper;
import com.api.helpers.MappingHelper;
import com.api.repositories.*;
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
    @Autowired
    private SThemeRepo sThemeRepo;
    @Autowired
    private SsThemeRepo ssThemeRepo;

    @GetMapping("/formations")
    public List<FormationDTO> getAllFormation() {
        return mapListToDTO(formationRepo.findAll(), FormationDTO.class);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<FormationDTO> getFormationById(@PathVariable int id) {
        Formation formation = formationRepo.findById(id).orElseThrow(() -> new RuntimeException("No such Formation with id " + id));
        return ResponseEntity.ok(mapToDTO(formation, FormationDTO.class));
    }

    @GetMapping("/getByName/{name}")
    public ResponseEntity<FormationDTO> getFormationByName(@PathVariable String name) {
        Formation formation = formationRepo.findByName(name).orElseThrow(() -> new RuntimeException("No such Formation with name " + name));
        return ResponseEntity.ok(mapToDTO(formation, FormationDTO.class));
    }

    @GetMapping("/getByThemeId/{id}")
    public ResponseEntity<List<FormationDTO>> getFormationByThemeId(@PathVariable int id) {
        List<Formation> formationList = formationRepo.findByThemeId(id).orElseThrow(() -> new RuntimeException("No such Formation with theme id " + id));
        return ResponseEntity.ok(mapListToDTO(formationList, FormationDTO.class));
    }

    @GetMapping("/getBySThemeId/{id}")
    public ResponseEntity<List<FormationDTO>> getFormationBySThemeId(@PathVariable int id) {
        List<Formation> formationList = formationRepo.findBysThemesId(id).orElseThrow(() -> new RuntimeException("No such Formation with stheme id " + id));
        return ResponseEntity.ok(mapListToDTO(formationList, FormationDTO.class));
    }

    @GetMapping("/getBySsThemeId/{id}")
    public ResponseEntity<List<FormationDTO>> getFormationBySsThemeId(@PathVariable int id) {
        List<Formation> formationList = formationRepo.findByssThemesId(id).orElseThrow(() -> new RuntimeException("No such Formation with sstheme id " + id));
        return ResponseEntity.ok(mapListToDTO(formationList, FormationDTO.class));
    }

    @PostMapping("/createFormation")
    public FormationDTO createFormation(@RequestBody FormationDTO formationDTO) {

        Integer themeId = formationDTO.getThemeId();
        Theme theme = themeRepo.findById(themeId).orElseThrow(() -> new RuntimeException("No such Theme with id " + themeId));

        //TODO to factorize

        List<Integer> sThemesId = formationDTO.getSousThemesId();
        ListFieldRetrieverHelper<STheme,SThemeRepo> sThemeRetrieverHelper = new ListFieldRetrieverHelper<>();
        List<STheme> sThemesList = sThemeRetrieverHelper.getListFromId(sThemesId, sThemeRepo, STheme.class);

        List<Integer> ssThemesId = formationDTO.getSsThemesId();
        ListFieldRetrieverHelper<SsTheme,SsThemeRepo> ssThemeRetrieverHelper = new ListFieldRetrieverHelper<>();
        List<SsTheme> ssThemesList = ssThemeRetrieverHelper.getListFromId(ssThemesId, ssThemeRepo, SsTheme.class);

        Formation formation = reverseMapToDTO(formationDTO, Formation.class);
        formation.setTheme(theme);
        formation.setSThemes(sThemesList);
        formation.setSsThemes(ssThemesList);
        Formation formationSaved = formationRepo.save(formation);

        return mapToDTO(formationSaved, FormationDTO.class);
    }

    @PostMapping("/removeById")
    public boolean removeFormationById(@RequestBody int id) {
        formationRepo.deleteById(id);
        return true;
    }


}
