package com.api.entities;

import javax.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
@Table(name = "stagiaire")
public class Stagiaire {

    @Id
    @GeneratedValue
    @Column(name = "id_stagiaire")
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String mail;

    @ManyToMany(targetEntity = Formation.class)
    @JoinTable(name= "stagiaire_formation",
            joinColumns = @JoinColumn(name="id_stagiaire"),
            inverseJoinColumns = @JoinColumn(name="id_formation"))
    private List<Formation> formationList;

    private boolean isPro;

    @ManyToOne(targetEntity = Entreprise.class)
    @JoinColumn(name = "id_entreprise")
    private Entreprise entreprise;


    public Stagiaire() {
    }

}
