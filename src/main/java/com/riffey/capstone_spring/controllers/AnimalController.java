package com.riffey.capstone_spring.controllers;

import com.riffey.capstone_spring.domain.Animals;
import com.riffey.capstone_spring.domain.Customers;
import com.riffey.capstone_spring.services.AnimalService;
import com.riffey.capstone_spring.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;



@Controller
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @RequestMapping("/animals")
    public String viewAnimalPage(Model model) {
        List<Animals> listAnimals = animalService.listAll();
        model.addAttribute("listAnimals", listAnimals);
        return "animals";
    }

    @RequestMapping("/new_animal")
    public String showNewAnimal(Model model) {
        Animals animals = new Animals();
        model.addAttribute("animals", animals);

        return "new_animal";
    }
    @RequestMapping("/edit_animal/{animalId}")
    public ModelAndView showEditAnimalPage(@PathVariable(name = "animalId") int animalId) {
        ModelAndView mav = new ModelAndView("edit_animal");
        Animals animals = animalService.get(animalId);
        mav.addObject("animals", animals);
        return mav;
    }

    @RequestMapping(value = "/save_animal", method = RequestMethod.POST)
    public String saveAnimals(@ModelAttribute("animals") Animals animals) {
        animalService.save(animals);
        return "redirect:/";
    }
}
