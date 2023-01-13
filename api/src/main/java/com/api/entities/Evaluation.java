package com.api.entities;

import lombok.Data;

@Data
public class Evaluation {
    int id;
    String name;
    int note;

    public Evaluation() {
    }
}
