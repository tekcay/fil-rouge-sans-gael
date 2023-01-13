package com.api.entities;

import lombok.Data;

@Data
public class Entreprise {
    private int id;
    private String mail;
    private String name;

    public Entreprise() {
    }
}
