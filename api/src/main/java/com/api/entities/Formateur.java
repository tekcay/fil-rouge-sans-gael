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

    @OneToMany(mappedBy = "evaluationForm")
    private List<EvaluationForm> evaluationFormList;

    @OneToOne
    @JoinColumn(name = "id_formation", referencedColumnName = "id_formateur")
    private Formation formation;


    public Formateur() {
    }
}
