package com.example.demo.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recepcjonisci",schema = "public")
public class Receptionist {
    @Id
    @Column(name = "pesel")
    private Long pesel;
    @Column(name = "password")
    private String password;


    public Receptionist() {
    }

    public Receptionist(Long pesel, String password) {
        this.pesel = pesel;
        this.password = password;
    }

    public Long getPesel() {
        return pesel;
    }

    public void setPesel(Long pesel) {
        this.pesel = pesel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
