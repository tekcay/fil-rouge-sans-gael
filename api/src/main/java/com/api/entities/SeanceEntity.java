package com.api.entities;

import lombok.Data;

import java.util.Date;
@Data
public class SeanceEntity {
    int id;
    Date debut;
    Date fin;
    Salle salle;

    public SeanceEntity() {
    }
}
