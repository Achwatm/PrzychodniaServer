package com.example.demo.dao;


import javax.persistence.*;

@Entity
@Table(name = "cards",schema = "public")
public class PatientCard {
    @Id
    @Column(name = "pesel", columnDefinition = "BIGINT")
    private Long pesel;
    @Column(name = "imie")
    private String name;
    @Column(name = "nazwisko")
    private String surname;
    @Column(name = "opis_poprzednich_wizyt")
    private String visitHistory;
    @Column(name = "zalecenia")
    private String recom;
    @Column(name = "id_lekarza")
    private Integer doctorId;

    public PatientCard() {
    }

    public Long getPesel() {
        return pesel;
    }

    public void setPesel(Long pesel) {
        this.pesel = pesel;
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

    public String getVisitHistory() {
        return visitHistory;
    }

    public void setVisitHistory(String visitHistory) {
        this.visitHistory = visitHistory;
    }

    public String getRecom() {
        return recom;
    }

    public void setRecom(String recom) {
        this.recom = recom;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }
}
