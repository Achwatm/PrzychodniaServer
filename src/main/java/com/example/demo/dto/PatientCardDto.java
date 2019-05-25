package com.example.demo.dto;

public class PatientCardDto {
    private Long pesel;
    private String visit;
    private String recom;
    private Integer doctorId;

    public PatientCardDto() {
    }

    public PatientCardDto(Long pesel, String name, String surname, String visitHistory, String recom, Integer doctorId) {
        this.pesel = pesel;
        this.visit = visit;
        this.recom = recom;
        this.doctorId = doctorId;
    }

    public Long getPesel() {
        return pesel;
    }

    public void setPesel(Long pesel) {
        this.pesel = pesel;
    }


    public String getVisit() {
        return visit;
    }

    public void setVisit(String visit) {
        this.visit = visit;
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
