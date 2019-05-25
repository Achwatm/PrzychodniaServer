package com.example.demo.dto;


public class DoctorRoleDto {

    private Long pesel;
    private String password;

    public DoctorRoleDto() {
    }

    public DoctorRoleDto(Long pesel, String password) {
        this.pesel = pesel;
        this.password = password;
    }

    public Long getPesel() {
        return pesel;
    }

    public void setPesel(Long licenseNumber) {
        this.pesel = licenseNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
