package com.example.demo.dto;

import java.sql.Date;
import java.sql.Time;


public class AppointmentDto {
    private Integer lp;
    private String pesel;
    private Date date;
    private Time time;
    private Long doctorId;

    public AppointmentDto() {
    }

    public AppointmentDto(String pesel, Date date, Time time, Long doctorId) {
        this.pesel = pesel;
        this.date = date;
        this.time = time;
        this.doctorId = doctorId;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }
}
