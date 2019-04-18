package com.example.demo.dao;



import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "users",schema = "public")

public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private Integer idUser;
    @Column(name = "nick")
    private String nick;
    @Column(name = "e_mail")
    private String eMail;
    @Column(name = "photo")
    private String photo;
    @Column(name = "data_of_brtth")
    private String dateOfBirth;
    @Column(name = "password")
    private String password;

    @Transient
    private String passwordSecond;

    public Users(Users user) {
    }
    public Users() {
        this.nick = nick;
        this.eMail = eMail;
        this.photo = photo;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
    }

    public String getPasswordSecond() {
        return passwordSecond;
    }

    public void setPasswordSecond(String passwordSecond) {
        this.passwordSecond = passwordSecond;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
