package com.api.entities;

import lombok.Data;

import jakarta.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "sSTheme")
public class SsTheme {

    @Id
    @GeneratedValue
    @Column(name = "id_sSTheme")
    private Integer id;

    private String name;

    @ManyToMany(mappedBy = "ssThemes")
    private List<STheme> sThemeList;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name= "sSTheme_formation",
            joinColumns = @JoinColumn(name="id_sSTheme"),
            inverseJoinColumns = @JoinColumn(name="id_formation"))
    private List<SsTheme> formations;

    public SsTheme() {
    }

}
