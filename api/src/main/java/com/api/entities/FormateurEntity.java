package com.api.entities;

import lombok.Data;

@Data
public class FormateurEntity {
    int id;
    String name;
    String mail;
    private int experience;
    List<Eval>notes;
    public class FormateurEntity(){
    }
}
