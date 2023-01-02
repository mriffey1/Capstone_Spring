package com.riffey.capstone_spring.repositories;

import com.riffey.capstone_spring.domain.Animals;
import com.riffey.capstone_spring.domain.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animals, Integer> {
}
