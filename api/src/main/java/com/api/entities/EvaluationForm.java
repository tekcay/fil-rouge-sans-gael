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
    private int id;

    @OneToMany(mappedBy = "evaluationForm")
    private List<Evaluation> evaluationsList;
    private boolean isRecommended;

    private String other;

    public EvaluationForm() {
    }
}
