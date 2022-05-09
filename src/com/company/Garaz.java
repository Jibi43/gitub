package com.company;

public class Garaz extends Pomieszczenie{
    int szerokoscBramy, wysokoscBramy;

    public Garaz(int szerokosc, int dlugosc, String nazwa, int szerokoscBramy, int wysokoscBramy) {
        super(szerokosc, dlugosc, nazwa);
        this.szerokoscBramy = szerokoscBramy;
        this.wysokoscBramy = wysokoscBramy;
    }

}
