package com.company;

public class Mitarbeiter1 {
    String vorname;
    String nachname;
    double gehalt;
    int alter;
    double taxableincome = monatsAbrechnung(28000);
    double tax = incomeTax(taxableincome);

    public double monatsAbrechnung(double gehalt)
    {   double taxableincome;
        taxableincome = (gehalt - (gehalt * 0.2));
        return taxableincome;
    }
    public double incomeTax(double taxableincome)
    {
        if(taxableincome<=10000)
            tax=(0.1 * 10000);
        else if(taxableincome>=10000 && taxableincome<=20000)
            tax=(
        //else if (taxableincome>=20000 && taxableincome<=30000)

        return tax;
    }
}
