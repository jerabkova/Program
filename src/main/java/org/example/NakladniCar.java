package org.example;

public class NakladniCar extends Car{
    private int nosnost;
    private int aktualniNaklad;

    public NakladniCar(String znacka, String model, int nosnost, int aktualniNaklad){
        super(znacka, model);
        this.nosnost = nosnost;
        this.aktualniNaklad = aktualniNaklad;
    }
    public int getAktualniNaklad() {
        return aktualniNaklad;
    }

    public int getNosnost() {
        return nosnost;
    }
    public void naloz(int kg) {
        if (kg > 0) {

        }

    }
    public void vyloz(int kg) {
        if (kg > 0) {
            aktualniNaklad -= kg;
            if (aktualniNaklad < 0) aktualniNaklad = 0;
        }

    }
    @Override
    public void vypisInfo() {
        System.out.println(toString());
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
