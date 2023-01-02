package com.riffey.capstone_spring.repositories;

import com.riffey.capstone_spring.domain.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customers, Integer> {

}
