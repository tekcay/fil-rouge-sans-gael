package com.api.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "sSTheme")
public class SsTheme {

    @Id
    @GeneratedValue
    @Column(name = "id_sSTheme")
    private int id;
    private String name;

    @ManyToMany(mappedBy = "ssThemes")
    private List<STheme> sThemeList;

    @ManyToMany(targetEntity = Formation.class)
    @JoinTable(name= "sSTheme_formation",
            joinColumns = @JoinColumn(name="id_sSTheme"),
            inverseJoinColumns = @JoinColumn(name="id_formation"))
    private List<SsTheme> formations;

    public SsTheme() {
    }
}
