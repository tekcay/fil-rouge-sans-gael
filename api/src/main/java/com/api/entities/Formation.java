package com.api.entities;

import lombok.Data;

import jakarta.persistence.*;
import java.util.List;

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

    @ManyToOne(targetEntity = Theme.class)
    @JoinColumn(name = "id_theme")
    private Theme theme;

    @ManyToMany(mappedBy = "formationList")
    private List<Stagiaire> stagiaireList;

    @ManyToMany(targetEntity = STheme.class)
    private List<STheme> sThemes;

    @ManyToMany(targetEntity = SsTheme.class)
    private List<SsTheme> ssThemes;

    public Formation() {
    }
}
