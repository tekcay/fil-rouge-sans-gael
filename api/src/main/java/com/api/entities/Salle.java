package com.api.entities;

import lombok.Data;

@Data
public class Salle {
    private int id;
    private String adresse;
    private int number;

    public Salle() {
    }
}
