package com.company;

public class Mitarbeiter{
    public static void main(String[] args) {
        String vorname;
        String nachname;
        double gehalt;
        int alter;
        double taxableincome = monatsAbrechnung(28000);
        System.out.println(taxableincome);
    }

    public static double monatsAbrechnung(double gehalt)
    {   double taxableincome;
        taxableincome = (gehalt - (gehalt * 0.2));
        return taxableincome;
    }
}
