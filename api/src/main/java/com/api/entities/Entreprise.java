package com.api.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Entity
public class Entreprise {

    @Id
    @GeneratedValue
    private int id;
    private String mail;
    private String name;
    @OneToMany(mappedBy = "entreprise")
    private List<Stagiaire> stagiaireList;

    public Entreprise() {
    }
}
