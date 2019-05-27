package com.example.demo.dao;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;


@Entity
@Table(name = "harmonogram",schema = "public")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer lp;
    @Column(name = "pesel")
    private String pesel;
    @Column(name = "data_wizyty")
    private Date date;
    @Column(name = "godzina_wizyty")
    private Time time;
    @Column(name = "id_lekarza")
    private Long doctorId;

    public Appointment() {
    }

    public Appointment(String pesel, Date date, Time time, Long doctorId) {
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
