package com.api.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "salle")
public class Salle {

    @Id
    @GeneratedValue
    @Column(name = "id_salle")
    private int id;

    private String adresse;
    private int number;

    @OneToOne(targetEntity = Seance.class)
    private Seance seance;

    public Salle() {
    }
}
