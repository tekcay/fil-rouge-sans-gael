package com.api.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "sTheme")
public class STheme {

    @Id
    @GeneratedValue
    @Column(name = "id_sTheme")
    private int id;

    @ManyToOne
    @JoinColumn(name = "id_theme")
    private Theme theme;

    @ManyToMany
    @JoinTable(name= "sTheme_sSTheme",
            joinColumns = @JoinColumn(name="id_sTheme"),
            inverseJoinColumns = @JoinColumn(name="id_sSTheme"))
    private List<SsTheme> ssThemes;

    private String name;


    public STheme() {
    }
}
