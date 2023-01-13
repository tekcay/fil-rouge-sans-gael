package com.api.entities;

import lombok.Data;

import java.util.List;
@Data
public class Theme {
    private int id;
    private String name;
    private List<STheme> sThemes;

    public Theme() {
    }
}
