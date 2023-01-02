package com.riffey.capstone_spring.services;

import java.util.List;

import com.riffey.capstone_spring.repositories.CustomerRepository;
import com.riffey.capstone_spring.domain.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepository custRepo;

    public List<Customers> listAll() {
        return custRepo.findAll();
    }

    public void save(Customers customers) {
        custRepo.save(customers);
    }

    public Customers get(int custId) {
        return custRepo.findById(custId).get();
    }

    public void delete(int custId) {
        custRepo.deleteById(custId);
    }
}
