package com.example.demo.dao;

import javax.persistence.*;

@Entity
@Table(name = "lekarze",schema = "public")
public class Doctor {
    @Id
    @Column(name = "id_lekarza", columnDefinition = "BIGINT")
    private Long doctorId;
    @Column(name = "imie")
    private String name;
    @Column(name = "nazwisko")
    private String surname;
    @Column(name = "specjalnosc")
    private String speciality;
    @Column(name = "nr_telefonu")
    private String phoneNumber;

    public Doctor() {
    }

    public Doctor(Long doctorId, String name, String surname, String speciality, String phoneNumber) {
        this.doctorId = doctorId;
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.phoneNumber = phoneNumber;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setIdDoctor(Long doctorId) {
        this.doctorId = doctorId;
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

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}