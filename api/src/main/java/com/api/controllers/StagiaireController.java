package com.api.controllers;

import com.api.entities.Stagiaire;
import com.api.repositories.StagiaireRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/stagiaire-controller")
public class StagiaireController {

    @Autowired
    private StagiaireRepo stagiaireRepo;

    @GetMapping("/stagiaires")
    public List<Stagiaire> getAllStagiaires() {
        return stagiaireRepo.findAll();
    }

    @GetMapping("/stagiaires/{id}")
    public ResponseEntity<Stagiaire> getStagiaireById(@PathVariable int id) {
        Stagiaire stagiaire = stagiaireRepo.findById(id).orElseThrow(() -> new RuntimeException("No such Stagiaire with id " + id));
        return ResponseEntity.ok(stagiaire);
    }

    @PostMapping("create-stagiaire")
    public boolean createStagiaire(@RequestBody Stagiaire stagiaire) {
        stagiaireRepo.save(stagiaire);
        return true;
    }


}
