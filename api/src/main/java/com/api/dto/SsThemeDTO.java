package com.api.dto;

import lombok.Data;

@Data
public class SsThemeDTO {

    private Integer id;
    private String name;

    public SsThemeDTO(String name) {
        this.name = name;
    }
}
