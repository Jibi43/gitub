package com.company;

public class Main {

    public static void main(String[] args) {
        new Pomieszczenie[] mojePomieszczenia = {
                new Pomieszczenie(){
                    this.szerokosc = 3;
                    this.dlugosc = 2;
                    this.nazwa = "pokoj"
                },
                new Pomieszczenie(){
                        szerokosc = 2;
                        dlugosc = 2;
                        nazwa = "lazienka";
                }

        };
        Mieszkanie mojeMieszkanie = new Mieszkanie(){
        ElementPietra[] mojeElementyParteru = {
                mojeMieszkanie,
                new Pomieszczenie(){
                    szerokosc = 2;
                    dlugosc =2;
                    nazwa = "suszarnia"
                }
            }
        };
        Pietro[] mojePietra = {
                new Pietro() {
                    numerPietra = 0;
                    elementy = mojeElementyParteru;
                }
        };
        Garaz[] mojeGaraze = {
                new Garaz(){
                    szerokoscBramy = 3;
                    wysokoscBramy = 2;
                    szerokosc = 5;
                    dlugosc = 5;
                }
        };
        Budynek mojBudynek = new Budynek(){
            powierzchniaDizalki = 20;
            pietra = mojePiera;
            garaze = mojeGaraze;
        };
        System.out.println(mojBudynek.PoliczPole());

    }

}
