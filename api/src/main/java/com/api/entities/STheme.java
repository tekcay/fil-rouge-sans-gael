package com.api.entities;

import lombok.Data;

import jakarta.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "sTheme")
public class STheme {

    @Id
    @GeneratedValue
    @Column(name = "id_sTheme")
    private int id;

    @ManyToOne(targetEntity = Theme.class)
    @JoinColumn(name = "id_theme")
    private Theme theme;

    @ManyToMany(targetEntity = SsTheme.class)
    @JoinTable(name= "sTheme_sSTheme",
            joinColumns = @JoinColumn(name="id_sTheme"),
            inverseJoinColumns = @JoinColumn(name="id_sSTheme"))
    private List<SsTheme> ssThemes;

    @ManyToMany(targetEntity = Formation.class)
    @JoinTable(name= "sTheme_formation",
            joinColumns = @JoinColumn(name="id_sTheme"),
            inverseJoinColumns = @JoinColumn(name="id_formation"))
    private List<Formation> formations;

    private String name;


    public STheme() {
    }
}
