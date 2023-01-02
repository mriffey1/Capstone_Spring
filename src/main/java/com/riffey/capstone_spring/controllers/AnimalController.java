package com.riffey.capstone_spring.controllers;

import com.riffey.capstone_spring.services.AnimalService;
import com.riffey.capstone_spring.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AnimalController {

    @Autowired
    private AnimalService animalService;
}
