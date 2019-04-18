package com.example.demo.dao;

import javax.persistence.*;

@Entity
@Table(name = "pacjenci",schema = "public")
public class Patients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pesel")
    private String pesel;
    @Column(name = "adres")
    private String adres;
    @Column(name = "nr_ubezpieczenia")
    private String nrUbezpieczenia;
    @Column(name = "imie")
    private String imie;
    @Column(name = "nr_telefonu")
    private String nrTelefonu;
    @Column(name = "nazwisko")
    private String nazwisko;

    public Patients() {
    }

    public Patients(String pesel,String adres, String nrUbezpieczenia, String imie, String nrTelefonu, String nazwisko) {
        this.pesel = pesel;
        this.adres = adres;
        this.nrUbezpieczenia = nrUbezpieczenia;
        this.imie = imie;
        this.nrTelefonu = nrTelefonu;
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getNrUbezpieczenia() {
        return nrUbezpieczenia;
    }

    public void setNrUbezpieczenia(String nrUbezpieczenia) {
        this.nrUbezpieczenia = nrUbezpieczenia;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return
                "pesel='" + pesel + '\'' +
                ", adres='" + adres + '\'' +
                ", nrUbezpieczenia='" + nrUbezpieczenia + '\'' +
                ", imie='" + imie + '\'' +
                ", nrTelefonu='" + nrTelefonu + '\'' +
                ", nazwisko='" + nazwisko + "\n"
                ;
    }
}
