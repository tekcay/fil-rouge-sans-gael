package com.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private Integer id;
    private String name;
    private String mail;
    private String role;

    public UserDTO(String name, String mail, String role) {
        this.name = name;
        this.mail = mail;
        this.role = role;
    }
}
