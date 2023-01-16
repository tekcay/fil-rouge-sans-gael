package com.api.entities;

import lombok.Data;

import jakarta.persistence.*;

@Data
@Entity
@Table(name = "responsable")
public class Responsable {

    @Id
    @GeneratedValue
    @Column(name = "id_responsable")
    private int id;

    private String name;
    private String mail;

    public Responsable(){
    }
}
