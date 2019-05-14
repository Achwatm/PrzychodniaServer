package com.example.demo.dto;

public class PatientCardDto {
    private Long pesel;
    private String name;
    private String surname;
    private String visitHistory;
    private String recom;
    private Integer doctorId;

    public PatientCardDto() {
    }

    public PatientCardDto(Long pesel, String name, String surname, String visitHistory, String recom, Integer doctorId) {
        this.pesel = pesel;
        this.name = name;
        this.surname = surname;
        this.visitHistory = visitHistory;
        this.recom = recom;
        this.doctorId = doctorId;
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
