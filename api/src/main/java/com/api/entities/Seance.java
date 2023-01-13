package com.api.entities;

import lombok.Data;

import java.util.Date;
@Data
public class Seance {
    int id;
    Date debut;
    Date fin;
    Salle salle;

    public Seance() {
    }
}
