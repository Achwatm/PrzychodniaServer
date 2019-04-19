package com.example.demo.dao;

import javax.persistence.*;

@Entity
@Table(name = "lekarze",schema = "public")
public class Doctor {
    @Id
    @Column(name = "id_lekarza", columnDefinition = "INTEGER")
    private Integer doctorId;
    @Column(name = "imie")
    private String name;
    @Column(name = "nazwisko")
    private String surname;
    @Column(name = "specjalnosc")
    private String speciality;
    @Column(name = "nr_pozwolenia")
    private String licenseNumber;
    @Column(name = "nr_telefonu")
    private String phoneNumber;

    public Doctor() {
    }

    public Doctor(Integer doctorId, String name, String surname, String speciality, String licenseNumber, String phoneNumber) {
        this.doctorId = doctorId;
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.licenseNumber = licenseNumber;
        this.phoneNumber = phoneNumber;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setIdDoctor(Integer doctorId) {
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

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}