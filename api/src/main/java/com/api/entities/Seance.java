package com.api.entities;

import javax.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
@Table(name = "seance")
public class Seance {

    @Id
    @GeneratedValue
    @Column(name = "id_seance")
    private int id;
    private Date debut;
    private Date fin;

    @OneToOne
    private Salle salle;

    public Seance() {
    }
}
