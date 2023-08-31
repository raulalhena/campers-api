package com.campers.campers.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Camper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer age;
    private String username;
    private String password;
    @OneToMany(mappedBy = "camper")
    private List<Signup> signups;

}
