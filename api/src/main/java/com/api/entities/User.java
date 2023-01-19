package com.api.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id_user")
    private Integer id;

    private String name;
    private String mail;
    private String login;
    private String password;
    private String role;

}
