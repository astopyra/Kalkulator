package com.kodilla.kalkulator;

public class Kalkulator {

    public static void main(String[] args) {

        double wynik;
        Kalkulator calc = new Kalkulator();

        wynik = calc.add(10.5, 20);
        System.out.println("Wynik dodawania:" + wynik);

        wynik = calc.subtract(10.5, 20);
        System.out.println("Wynik odejmowania:" + wynik);

    }

    public double add(double x, double y){
           return x+y;
    }

    public double subtract(double x, double y){
        return x-y;
    }
}
