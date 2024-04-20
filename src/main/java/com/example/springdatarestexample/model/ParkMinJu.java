package com.example.springdatarestexample.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "park_minju")
public class ParkMinJu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    protected ParkMinJu() {
    }

}
