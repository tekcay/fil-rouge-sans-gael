package com.api.entities;



import ch.qos.logback.core.joran.sanity.Pair;
import lombok.Data;

import java.util.List;
@Data
public class Stagiaire {
    private int id;
    private String name;
    private String mail;
    private List<Pair<Formation,Integer>> formationsNote;
    private boolean isPro;
    private Entreprise Entreprise;

    public Stagiaire() {
    }

}
