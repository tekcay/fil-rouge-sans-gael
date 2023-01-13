package com.api.entities;

import lombok.Data;

import java.util.List;
@Data
public class EvaluationForm {
    private int id;
    private List<Evaluation> evaluations;
    private boolean isRecommended;

    private String other;

    public EvaluationForm() {
    }
}
