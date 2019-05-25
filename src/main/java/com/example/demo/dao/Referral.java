package com.example.demo.dao;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "skierowania",schema = "public")
public class Referral {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer lp;
    @Column(name = "pesel")
    private String pesel;
    @Column(name = "rodzaj_badan")
    private String typeOfTest;
    @Column(name = "data_wystawienia")
    private Date date;
    @Column(name = "id_lekarza")
    private Integer doctorId;

    public Referral() {
    }

    public Referral(String pesel, String typeOfTest, Date date, Integer doctorId) {
        this.pesel = pesel;
        this.typeOfTest = typeOfTest;
        this.date = date;
        this.doctorId = doctorId;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getTypeOfTest() {
        return typeOfTest;
    }

    public void setTypeOfTest(String typeOfTest) {
        this.typeOfTest = typeOfTest;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }
}

