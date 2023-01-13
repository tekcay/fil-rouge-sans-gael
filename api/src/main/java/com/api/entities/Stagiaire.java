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

    @ManyToMany
    @JoinTable(name= "stagiaire_formation",
            joinColumns = @JoinColumn(name="id_stagiaire"),
            inverseJoinColumns = @JoinColumn(name="id_formation"))
    private List<Formation> formationList;

    private boolean isPro;

    @ManyToOne
    @JoinColumn(name = "id_entreprise")
    private Entreprise Entreprise;


    public Stagiaire() {
    }

}
