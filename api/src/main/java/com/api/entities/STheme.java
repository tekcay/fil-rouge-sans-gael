package com.api.entities;

import lombok.Data;

import java.util.List;

@Data
public class STheme {
    private int id;
    private String name;
    private List<SsTheme> ssThemes;

    public STheme() {
    }
}
