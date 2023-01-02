package com.riffey.capstone_spring.domain;

import javax.persistence.*;

@Entity
@Table(name = "animals")
public class Animals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Animal_ID")
    private int animalId;

    @Column(name = "Name")
    private String animalName;

    @Column(name = "Type")
    private String animalType;

    @Column(name = "Age")
    private int animalAge;

    @Column(name = "Breed")
    private String animalBreed;

    @Column(name = "Weight")
    private int animalWeight;

    @Column(name = "Customer_ID")
    private int custId;
}
