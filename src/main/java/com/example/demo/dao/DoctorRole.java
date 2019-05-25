package com.example.demo.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.*;


@Entity
@Table(name = "doctor_role",schema = "public")

public class DoctorRole {

    @Id
    @Column(name = "id_pozwolenia", columnDefinition = "BIGINT")
    private Long pesel;
    @Column(name = "password")
    private String password;


    public DoctorRole() {
    }

    public DoctorRole(Long pesel, String password) {
        this.pesel = pesel;
        this.password = password;
    }

    public Long getPesel() {
        return pesel;
    }

    public void setPesel(Long licenseNumber) {
        this.pesel = licenseNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}


