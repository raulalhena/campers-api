package com.campers.campers.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Signup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;
    private Integer time;
    @ManyToOne
    @JoinColumn(name = "camper_id")
    private Camper camper;
}
