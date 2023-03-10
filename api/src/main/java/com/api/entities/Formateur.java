package com.api.entities;

import lombok.Data;

import jakarta.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "formateur")
public class Formateur {

    @Id
    @GeneratedValue
    @Column(name = "id_formateur")
    private int id;

    private String name;
    private String mail;
    private int experience;

    private int note;

    @OneToMany(mappedBy = "formateur")
    private List<EvaluationForm> evaluationFormList;

    @OneToOne(targetEntity = Formation.class)
    @JoinColumn(name = "id_formation")
    private Formation formation;


    public Formateur() {
    }
}
