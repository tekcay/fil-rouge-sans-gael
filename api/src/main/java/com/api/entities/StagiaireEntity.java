package com.api.entities;



import ch.qos.logback.core.joran.sanity.Pair;
import lombok.Data;

import java.util.List;
@Data
public class StagiaireEntity {
    int id;
    String name;
    String mail;
    List<Pair<Formation,Integer>> formationsNote;
    private boolean isPro;
    Entreprise Entreprise;

    public class StagiaireEntity(){
    }
}
