package com.example.demo.dto;

import java.util.Date;

public class ReferralDto {
    private Integer lp;
    private String pesel;
    private String typeOfTest;
    private Date date;
    private Integer doctorId;

    public ReferralDto() {
    }

    public ReferralDto(String pesel, String typeOfTest, Date date, Integer doctorId) {
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
