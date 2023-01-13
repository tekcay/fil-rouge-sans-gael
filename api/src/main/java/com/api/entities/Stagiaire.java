package com.api.entities;



import ch.qos.logback.core.joran.sanity.Pair;
import javax.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class Stagiaire {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String mail;
    private List<Pair<Formation,Integer>> formationsNote;
    private boolean isPro;

    @ManyToOne
    @JoinColumn(name = "id_entreprise")
    private Entreprise Entreprise;


    public Stagiaire() {
    }

}
