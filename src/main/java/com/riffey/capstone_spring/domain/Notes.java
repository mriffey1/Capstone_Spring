package com.riffey.capstone_spring.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notes")
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "notes_id")
    private int notesId;

    @Column(name = "Notes")
    private String notesField;

    @Column(name = "created")
    private LocalDateTime noteCreated;

    public int getNotesId() {
        return notesId;
    }

    public void setNotesId(int notesId) {
        this.notesId = notesId;
    }

    public String getNotesField() {
        return notesField;
    }

    public void setNotesField(String notesField) {
        this.notesField = notesField;
    }

    public LocalDateTime getNoteCreated() {
        return noteCreated;
    }

    public void setNoteCreated(LocalDateTime noteCreated) {
        this.noteCreated = noteCreated;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    @Column(name = "animal_id")
    private int animalId;
}
