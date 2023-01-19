package com.api.entities;

import lombok.Data;

import jakarta.persistence.*;
import java.util.List;
@Data
@Entity
@Table(name = "theme")
public class Theme {

    @Id
    @GeneratedValue
    @Column(name = "id_theme")
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "theme")
    private List<STheme> sThemes;

    @OneToMany(mappedBy = "theme")
    private List<Formation> formationList;

    public Theme() {
    }
}
