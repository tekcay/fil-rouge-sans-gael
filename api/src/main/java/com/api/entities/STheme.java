package com.api.entities;

import lombok.Data;

import java.util.List;

@Data
public class STheme {
    int id;
    String name;
    List<SsTheme> ssThemes;

    public STheme() {
    }
}
