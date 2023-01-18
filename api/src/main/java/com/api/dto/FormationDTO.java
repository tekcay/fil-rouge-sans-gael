package com.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormationDTO {

    private Integer formateurId;
    private String name;
    private boolean isConfirmed;
    private int minParticipants;
    private boolean isPerso;
    private boolean isInterEntreprise;
    private String link;
    //private List<Seance> seances;
    private double prix;
    private Integer themeId;

    private List<Integer> sThemesId;
    private List<Integer> ssThemesId;

    public FormationDTO(String name, Integer themeId) {
        this.name = name;
        this.themeId = themeId;
    }


}
