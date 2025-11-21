package org.example;

public class Car {
    private String znacka;
    private String model;
    private int rokVyroby;
    private int rychlost;

    public Car(String znacka, String model, int rokVyroby, int rychlost) {
        this.znacka = znacka;
        this.model = model;
        this.rokVyroby = rokVyroby;
        this.rychlost = rychlost;
    }

    public void zrychleni(int x) {
        if (x > 0) rychlost += x;
    }

    public void zpomaleni(int x) {
        if (x > 0) {
            rychlost -= x;
            if (rychlost < 0) rychlost = 0;
        }
    }

    public void zastav() {
        rychlost = 0;
    }
    public void vypisInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString(){
        return "";
    }


    public int getRokVyroby() {
        return rokVyroby;
    }

}


