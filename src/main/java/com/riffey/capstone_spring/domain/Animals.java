package com.riffey.capstone_spring.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "animals")
public class Animals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Animal_ID")
    private int animalId;

//    @OneToMany(targetEntity = Customers.class, mappedBy = "Customer_ID", orphanRemoval = false, fetch = FetchType.LAZY)
//    private Set<Customers> customers;

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

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    public String getAnimalBreed() {
        return animalBreed;
    }

    public void setAnimalBreed(String animalBreed) {
        this.animalBreed = animalBreed;
    }

    public int getAnimalWeight() {
        return animalWeight;
    }

    public void setAnimalWeight(int animalWeight) {
        this.animalWeight = animalWeight;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }
}
