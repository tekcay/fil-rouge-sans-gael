package com.api.entities;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Evaluation {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int note;

    @ManyToOne
    @JoinColumn(name = "id_evaluationForm")
    private List<EvaluationForm> evaluationFormList;

    public Evaluation() {
    }
}
