package com.api.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
@Entity
@Table(name = "theme")
public class Theme {

    @Id
    @GeneratedValue
    @Column(name = "id_theme")
    private int id;

    private String name;

    @OneToMany(mappedBy = "sTheme")
    private List<STheme> sThemes;

    @OneToMany(mappedBy = "formation")
    private List<Formation> formationList;

    public Theme() {
    }
}
