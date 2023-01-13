package com.api.entities;

import lombok.Data;

import java.util.List;
@Data
public class ThemeEntity {
    int id;
    String name;
    List<STheme>sThemes;

    public ThemeEntity() {
    }
}
