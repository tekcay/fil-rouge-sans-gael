package com.api.entities;

import lombok.Data;

import java.util.List;
@Data
public class FormationEntity {
    int id;
    boolean isConfirmed;
    int minParticipants;
    int nbParticipants;
    boolean isPerso;
    List<Formateur>formateurs;
    boolean isInterEntreprise;
    String link;
    List<Seance>seances;
    double prix;
    Theme theme;
    List<STheme>sThemes;
    List<SsTheme>ssThemes;

    public FormationEntity() {
    }
}
