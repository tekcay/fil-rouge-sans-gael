package com.api.entities;

import lombok.Data;

import java.util.List;

@Data
public class Formateur {
    private int id;
    private String name;
    private String mail;
    private int experience;
    private List<Evaluation> notes;
    public Formateur() {
    }
}
