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
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_theme")
    private Theme theme;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name= "sTheme_sSTheme",
            joinColumns = @JoinColumn(name="id_sTheme"),
            inverseJoinColumns = @JoinColumn(name="id_sSTheme"))
    private List<SsTheme> ssThemes;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name= "sTheme_formation",
            joinColumns = @JoinColumn(name="id_sTheme"),
            inverseJoinColumns = @JoinColumn(name="id_formation"))
    private List<Formation> formations;

    private String name;


    public STheme() {
    }
}
