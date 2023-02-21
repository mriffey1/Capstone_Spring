package com.riffey.capstone_spring.repositories;

import com.riffey.capstone_spring.domain.Appointments;
import com.riffey.capstone_spring.domain.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointments, Integer> {
}
