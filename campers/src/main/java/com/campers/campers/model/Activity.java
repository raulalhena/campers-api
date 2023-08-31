package com.campers.campers.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer difficulty;
    @OneToMany(mappedBy = "activity")
    private List<Signup> signups;
}
