package com.api.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "evaluation")
public class Evaluation {

    @Id
    @GeneratedValue
    @Column(name = "id_evaluation")
    private int id;
    private String name;
    private int note;

    @ManyToOne(targetEntity = EvaluationForm.class)
    @JoinColumn(name = "id_evaluationForm")
    private List<EvaluationForm> evaluationFormList;

    public Evaluation() {
    }
}
