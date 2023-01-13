package com.api.entities;

import lombok.Data;

@Data
public class Responsable {
    private int id;
    private String name;
    private String mail;

    public Responsable(){
    }
}
