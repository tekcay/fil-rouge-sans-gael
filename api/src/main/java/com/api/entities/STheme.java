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

    private String name;
    private List<SsTheme> ssThemes;

    public STheme() {
    }
}
