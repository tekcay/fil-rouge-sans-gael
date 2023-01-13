package com.api.entities;

import lombok.Data;

import java.util.List;
@Data
public class Formation {
    private int id;
    private boolean isConfirmed;
    private int minParticipants;
    private int nbParticipants;
    private boolean isPerso;
    private List<Formateur> formateurs;
    private boolean isInterEntreprise;
    private String link;
    private List<Seance>seances;
    private double prix;
    private Theme theme;
    private List<STheme> sThemes;
    private List<SsTheme> ssThemes;

    public Formation() {
    }
}
