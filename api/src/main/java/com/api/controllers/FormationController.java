package com.api.controllers;

import com.api.entities.Formation;
import com.api.repositories.FormationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/formation-controller")
public class FormationController {

    @Autowired
    private FormationRepo formationRepo;

    @GetMapping("/formations")
    public List<Formation> getAllFormation() {
        return formationRepo.findAll();
    }

    @GetMapping("/formations/{id}")
    public ResponseEntity<Formation> getFormationById(@PathVariable int id) {
        Formation formation = formationRepo.findById(id).orElseThrow(() -> new RuntimeException("No such Formation with id " + id));
        return ResponseEntity.ok(formation);
    }

    @GetMapping("/formations/{name}")
    public ResponseEntity<Formation> getFormationByName(@PathVariable String name) {
        Formation formation = formationRepo.findByName(name).orElseThrow(() -> new RuntimeException("No such Formation with id " + name));
        return ResponseEntity.ok(formation);
    }

    @PostMapping("create-formation")
    public Formation createFormation(@RequestBody Formation formation) {
        return formationRepo.save(formation);
    }


}
