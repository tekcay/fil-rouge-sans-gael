package com.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormationDTO {

    private Integer id;
    private Integer formateurId;
    private String description;
    private String name;
    private boolean isConfirmed;
    private Integer minParticipants;
    private boolean isPerso;
    private boolean isInterEntreprise;
    private String link;
    //private List<Seance> seances;
    private double prix;
    private Integer themeId;

    private List<Integer> sousThemesId;
    private List<Integer> ssThemesId;

    public FormationDTO(String name, String description, Integer themeId, List<Integer> sousThemesId, List<Integer> ssThemesId) {
        this.name = name;
        this.description = description;
        this.themeId = themeId;
        this.sousThemesId = sousThemesId;
        this.ssThemesId = ssThemesId;

    }


}
