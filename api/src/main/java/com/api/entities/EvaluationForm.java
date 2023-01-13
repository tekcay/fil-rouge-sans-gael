package com.api.entities;

import lombok.Data;

import java.util.List;
@Data
public class EvaluationForm {
    int id;
    List<Evaluation> evaluations;
    boolean isRecommended;

    String other;

    public EvaluationForm() {
    }
}
