package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SpravceCar spravce = new SpravceCar();

        OsobniCar a1 = new OsobniCar("BMW", "Ahoj", 2019, 6, 5, 250);
        OsobniCar a2 = new OsobniCar("Škoda", "Ahoj", 2024, 8, 5, 300);

        NakladniCar n1 = new NakladniCar("Škoda", "Čau",2000, 850);
        NakladniCar n2 = new NakladniCar("BMW", "Čau",4000, 2000);

        spravce.pridejAuto(a1);
        spravce.pridejAuto(a2);
        spravce.pridejAuto(n1);
        spravce.pridejAuto(n2);

        spravce.vypisVsechnaAuta();

        System.out.println(spravce.prumerneStariAut());
        System.out.println(spravce.pocetOsobnichAut());
        System.out.println(spravce.pocetNakladnichAut());
        System.out.println(spravce.nejnovejsiAuto());

    }
}