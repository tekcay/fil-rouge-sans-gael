package com.api.entities;



import ch.qos.logback.core.joran.sanity.Pair;
import lombok.Data;

import java.util.List;
@Data
public class Stagiaire {
    int id;
    String name;
    String mail;
    List<Pair<Formation,Integer>> formationsNote;
    private boolean isPro;
    Entreprise Entreprise;

    public Stagiaire() {
    }

}
