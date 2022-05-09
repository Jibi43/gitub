package com.company;

public class Pomieszczenie extends ElementPietra implements PowierzchnioLiczone {
    int szerokosc, dlugosc;
    String nazwa;

    public Pomieszczenie(int szerokosc, int dlugosc, String nazwa) {
        this.szerokosc = szerokosc;
        this.dlugosc = dlugosc;
        this.nazwa = nazwa;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    public double getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
