package com.api.entities;

import lombok.Data;

import javax.persistence.*;
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

    @OneToMany(mappedBy = "formateur")
    private List<EvaluationForm> evaluationFormList;

    @OneToOne(targetEntity = Formation.class)
    @JoinColumn(name = "id_formation")
    private Formation formation;


    public Formateur() {
    }
}
