package com.example.demo.dao;




import javax.persistence.*;

@Entity
@Table(name = "users",schema = "public")

public class Users {

    @Id
    @Column(name = "pesel")
    private Long pesel;
    @Column(name = "password")
    private String password;
    @Column(name = "rola")
    private String role;


    public Users() {
    }

    public Users(Long pesel, String password, String role) {
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