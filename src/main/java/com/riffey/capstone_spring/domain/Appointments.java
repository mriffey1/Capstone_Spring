package com.riffey.capstone_spring.domain;



import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "appointments")
public class Appointments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id")
    private int apptId;

    @Column(name = "title")
    private String apptTitle;

    @Column(name = "description")
    private String apptDescription;

    @Column(name = "location")
    private String apptLocation;

    @Column(name = "type")
    private String apptType;

    @Column(name = "start")
    private LocalDateTime apptStart;

    public int getApptId() {
        return apptId;
    }

    public void setApptId(int apptId) {
        this.apptId = apptId;
    }

    public String getApptTitle() {
        return apptTitle;
    }

    public void setApptTitle(String apptTitle) {
        this.apptTitle = apptTitle;
    }

    public String getApptDescription() {
        return apptDescription;
    }

    public void setApptDescription(String apptDescription) {
        this.apptDescription = apptDescription;
    }

    public String getApptLocation() {
        return apptLocation;
    }

    public void setApptLocation(String apptLocation) {
        this.apptLocation = apptLocation;
    }

    public String getApptType() {
        return apptType;
    }

    public void setApptType(String apptType) {
        this.apptType = apptType;
    }

    public LocalDateTime getApptStart() {
        return apptStart;
    }

    public void setApptStart(LocalDateTime apptStart) {
        this.apptStart = apptStart;
    }

    public LocalDateTime getApptEnd() {
        return apptEnd;
    }

    public void setApptEnd(LocalDateTime apptEnd) {
        this.apptEnd = apptEnd;
    }

    @Column(name = "end")
    private LocalDateTime apptEnd;

}
