package com.api.entities;

import lombok.Data;

@Data
public class EvaluationEntity {
    int id;
    String name;
    int note;

    public EvaluationEntity() {
    }
}
