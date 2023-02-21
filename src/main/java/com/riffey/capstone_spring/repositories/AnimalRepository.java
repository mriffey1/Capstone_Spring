package com.riffey.capstone_spring.repositories;

import com.riffey.capstone_spring.domain.Animals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animals, Integer> {

}
