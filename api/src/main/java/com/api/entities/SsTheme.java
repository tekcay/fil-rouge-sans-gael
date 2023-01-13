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

    @ManyToMany(mappedBy = "sTheme")
    private List<STheme> sThemeList;

    public SsTheme() {
    }
}
