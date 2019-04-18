package com.example.demo.dto;

public class PatientDto {

    private String pesel;
    private String adres;
    private String nrUbezpieczenia;
    private String imie;
    private String nrTelefonu;
    private String nazwisko;

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
}
