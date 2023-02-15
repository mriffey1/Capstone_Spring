package com.riffey.capstone_spring.services;

import com.riffey.capstone_spring.domain.Animals;
import com.riffey.capstone_spring.repositories.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;
    public List<Animals> listAll() {
        return animalRepository.findAll();
    }

    public void save(Animals animals) {
        animalRepository.save(animals);
    }

    public Animals get(int animalId) {
        return animalRepository.findById(animalId).get();
    }

    public void delete(int animalId) {
        animalRepository.deleteById(animalId);
    }
}
