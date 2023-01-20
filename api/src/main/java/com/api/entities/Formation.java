package com.api.entities;

import lombok.Data;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntFunction;

@Data
@Entity
@Table(name = "formation")
public class Formation {

    @Id
    @GeneratedValue
    @Column(name = "id_formation")
    private Integer id;

    @OneToOne(targetEntity = Formateur.class, mappedBy = "formation")
    private Formateur formateur;

    private String name;
    private String description;
    private boolean isConfirmed;
    private Integer minParticipants;
    private boolean isPerso;
    private boolean isInterEntreprise;
    private String link;

    @OneToMany(mappedBy = "formation")
    private List<Seance> seances;

    private double prix;

    @ManyToOne
    @JoinColumn(name = "id_theme")
    private Theme theme;

    @ManyToMany(mappedBy = "formationList")
    private List<Stagiaire> stagiaireList;

    @ManyToMany(mappedBy = "formations")
    private List<STheme> sThemes;

    @ManyToMany(mappedBy = "formations")
    private List<SsTheme> ssThemes;

    public Formation() {
    }

}
