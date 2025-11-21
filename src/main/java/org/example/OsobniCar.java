package org.example;

public class OsobniCar extends Car {
    private int pocetMist;
    private int velikostKufru;



    public OsobniCar(String znacka, String model, int rokVyroby, int rychlost, int pocetMist, int velikostKufru) {
        super(znacka, model, rokVyroby, rychlost);
        this.pocetMist = pocetMist;
        this.velikostKufru = velikostKufru;
    }

    public int getPocetMist() {
        return pocetMist;
    }

    @Override
    public void vypisInfo(){
        System.out.println(toString());

    }
    @Override
    public String toString() {
        return super.toString();
    }

}
