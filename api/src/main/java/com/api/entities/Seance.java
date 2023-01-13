package com.api.entities;

import lombok.Data;

import java.util.Date;
@Data
public class Seance {
    private int id;
    private Date debut;
    private Date fin;
    private Salle salle;

    public Seance() {
    }
}
