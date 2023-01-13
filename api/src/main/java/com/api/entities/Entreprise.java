package com.api.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "entreprise")
public class Entreprise {

    @Id
    @GeneratedValue
    @Column(name = "id_entreprise")
    private int id;
    private String mail;
    private String name;
    @OneToMany(mappedBy = "entreprise")
    private List<Stagiaire> stagiaireList;

    public Entreprise() {
    }
}
