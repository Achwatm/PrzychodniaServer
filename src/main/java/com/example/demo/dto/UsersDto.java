package com.example.demo.dto;

public class UsersDto {

    private Long pesel;
    private String password;
    private String role;

    public UsersDto() {
    }

    public UsersDto(Long pesel, String password, String role) {
        this.pesel = pesel;
        this.password = password;
        this.role = role;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
