package com.api.entities;

import lombok.Data;

@Data
public class STheme {
    int id;
    String name;
    List<SsTheme>ssThemes;

    public STheme() {
    }
}
