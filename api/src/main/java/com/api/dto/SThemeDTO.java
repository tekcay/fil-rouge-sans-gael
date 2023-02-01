package com.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SThemeDTO {

    private Integer id;
    private String name;

    public SThemeDTO( String name) {
        this.name = name;
    }

}
