package com.riffey.capstone_spring.repositories;

import com.riffey.capstone_spring.domain.Customers;
import com.riffey.capstone_spring.domain.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Notes, Integer> {
}
