package com.api.entities;

import lombok.Data;

import java.util.List;
@Data
public class Theme {
    int id;
    String name;
    List<STheme>sThemes;

    public Theme() {
    }
}
