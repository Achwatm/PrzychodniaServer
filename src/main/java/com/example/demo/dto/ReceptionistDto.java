package com.example.demo.dto;

public class ReceptionistDto {

    private Long pesel;
    private String password;

    public ReceptionistDto() {
    }

    public ReceptionistDto(Long pesel, String password) {
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
