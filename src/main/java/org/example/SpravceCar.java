package org.example;

import java.util.ArrayList;
import java.util.List;

public class SpravceCar {
    private ArrayList<Car> seznamAut = new ArrayList<>();

    public void pridejAuto(Car a){
        seznamAut.add(a);

    }

    public void vypisVsechnaAuta(){
        for (Car a : seznamAut) {
            a.vypisInfo();
        }

    }



    public List<Car> najdiAutaPodleZnacky(String znacka) {
        List<Car> vysledek = new ArrayList<>();
        for (Car a : seznamAut) {
            if (a.toString().contains(znacka)) {
                vysledek.add(a);
            }
        }
        return vysledek;
    }

    public List<Car> najdiAutaPodleRoku(int rokOd, int rokDo){
        List<Car> vysledek = new ArrayList<>();
        for (Car a : seznamAut) {
            int y = a.getRokVyroby();
            if (y > rokOd) {
                vysledek.add(y);
            }
        }
        return vysledek;
    }


    public List<Car> najdiRychlaAuta(int minRychlost) {
        List<Car> vysledek = new ArrayList<>();
        for (Car a : seznamAut) {
            if(a.toString().contains(minRychlost)) {
                vysledek.add(a);
            }
        }
        return vysledek;
    }

    public List<NakladniCar> najdiNakladniAutaSNakladem(){
        List<Car> vysledek = new ArrayList<>();
        for (Car a : seznamAut) {

        }
        return vysledek;
    }

    public List<OsobniCar> najdiOsobniAutaSPocetemMist(int minPocetMist){
        List<Car> vysledek = new ArrayList<>();
        for (Car a : seznamAut) {

        }

        return vysledek;
    }

    public double prumerneStariAut() {
        int aktualniRok;


        for (Car a : seznamAut) {

        }
    }

    public int pocetOsobnichAut() {
        int pocet = 0;
        for (Car a : seznamAut) {


        }
        return pocet;
    }

    public int pocetNakladnichAut() {
        int pocet = 0;
        for (Car a : seznamAut) {


        }
        return pocet;
    }

    public Car nejnovejsiAuto() {

        for (Car a : seznamAut) {

        }
    }

}
