package com.api.entities;

import lombok.Data;

@Data
public class Evaluation {
    private int id;
    private String name;
    private int note;

    public Evaluation() {
    }
}
