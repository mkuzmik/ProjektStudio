package com.studio.model;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

public class Employee {
    private Long id;
    private String name;
    private String surname;
    private Date birthDate;
    private Time startConsultationTime;
    private Time endConsultationTime;
    private String consultationDay;
    private Room room;


    public String getConsultationDay() {
        return consultationDay;
    }

    public void setConsultationDay(String consultationDay) {
        this.consultationDay = consultationDay;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Time getStartConsultationTime() {
        return startConsultationTime;
    }

    public void setStartConsultationTime(Time startConsultationTime) {
        this.startConsultationTime = startConsultationTime;
    }

    public Time getEndConsultationTime() {
        return endConsultationTime;
    }

    public void setEndConsultationTime(Time endConsultationTime) {
        this.endConsultationTime = endConsultationTime;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
