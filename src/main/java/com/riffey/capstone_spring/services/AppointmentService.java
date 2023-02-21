package com.riffey.capstone_spring.services;

import com.riffey.capstone_spring.domain.Animals;
import com.riffey.capstone_spring.domain.Appointments;
import com.riffey.capstone_spring.repositories.AnimalRepository;
import com.riffey.capstone_spring.repositories.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;
    public List<Appointments> listAll() {
        return appointmentRepository.findAll();
    }

    public void save(Appointments appointments) {
        appointmentRepository.save(appointments);
    }

    public Appointments get(int appointId) {
        return appointmentRepository.findById(appointId).get();
    }

    public void delete(int appointId) {
        appointmentRepository.deleteById(appointId);
    }
}
