package com.example.demo.dao;


import javax.persistence.*;

@Entity
@Table(name = "cards",schema = "public")
public class PatientCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_card")
    private Integer cardId;
    @Column(name = "pesel", columnDefinition = "BIGINT")
    private Long pesel;
    @Column(name = "opis_wizyty")
    private String visit;
    @Column(name = "zalecenia")
    private String recom;
    @Column(name = "id_lekarza")
    private Integer doctorId;

    public PatientCard() {
    }

    public PatientCard(Long pesel, String visit, String recom, Integer doctorId) {
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
