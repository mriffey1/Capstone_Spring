package com.riffey.capstone_spring.controllers;

import com.riffey.capstone_spring.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class NoteController {
    @Autowired
    private NoteService noteService;
}
