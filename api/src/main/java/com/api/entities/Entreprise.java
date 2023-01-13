package com.api.entities;

import lombok.Data;

@Data
public class Entreprise {
    int id;
    String mail;
    String name;

    public Entreprise() {
    }
}
