package com.riffey.capstone_spring.controllers;

import com.riffey.capstone_spring.domain.Animals;
import com.riffey.capstone_spring.domain.Appointments;
import com.riffey.capstone_spring.services.AnimalService;
import com.riffey.capstone_spring.services.AppointmentService;
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
public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;


    @RequestMapping("/appointments")
    public String viewAppointmentPage(Model model) {
        List<Appointments> listAppointments = appointmentService.listAll();
        model.addAttribute("listAppointments", listAppointments);
        return "appointments";
    }

    @RequestMapping("/new_appointment")
    public String showNewAppointment(Model model) {
        Appointments appointments = new Appointments();
        model.addAttribute("appointments", appointments);

        return "new_appointment";
    }
    @RequestMapping("/edit_appointment/{appointId}")
    public ModelAndView showEditAppointmentPage(@PathVariable(name = "appointId") int appointId) {
        ModelAndView mav = new ModelAndView("edit_appointment");
        Appointments appointments = appointmentService.get(appointId);
        mav.addObject("appointments", appointments);
        return mav;
    }

    @RequestMapping(value = "/save_appointments", method = RequestMethod.POST)
    public String saveAppointments(@ModelAttribute("appointments") Appointments appointments) {
        appointmentService.save(appointments);
        return "redirect:/";
    }
}
