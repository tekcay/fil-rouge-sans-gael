package com.api.entities;



import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
@Table(name = "evaluationForm")
public class EvaluationForm {

    @Id
    @GeneratedValue
    @Column(name = "id_evaluationForm")
    private int id;

    @OneToMany(mappedBy = "evaluationFormList")
    private List<Evaluation> evaluationsList;
    private boolean isRecommended;

    private String other;

    @ManyToOne(targetEntity = Formateur.class)
    @JoinColumn(name = "id_formateur")
    private Formateur formateur;

    @ManyToOne(targetEntity = Seance.class)
    @JoinColumn(name = "id_seance")
    private Seance seance;

    public EvaluationForm() {
    }
}
