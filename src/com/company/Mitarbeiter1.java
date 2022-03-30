package com.company;

public class Mitarbeiter1 {
    String vorname;
    String nachname;
    double gehalt;
    int alter;
    double taxableincome = monatsAbrechnung(51000);
    double tax = incomeTax(taxableincome);

    public double monatsAbrechnung(double gehalt)
    {   double taxableincome;
        taxableincome = (gehalt - (gehalt * 0.2));
        return taxableincome;
    }
    public double incomeTax(double taxableincome)
    {    double taxincome = 0;
        if(taxableincome<=10000){
            tax=(0.1 * 10000);}
        else if(taxableincome>=10000 && taxableincome<=20000){
            taxincome = (taxableincome - 10000);
            tax=(1000 + (taxincome * 0.2));}
        else if (taxableincome>=20000 && taxableincome<=30000){
            taxincome = (taxableincome - 20000);
            tax=(3000 + (taxincome * 0.32));}
        else if (taxableincome>=30000 && taxableincome<=50000){
            taxincome = (taxableincome - 30000);
            tax=(6200 + (taxincome * 0.45));}
        else if (taxableincome>50000){
            taxincome = (taxableincome - 50000);
            tax=(15200 + (taxincome * 0.60));
            }
        return tax;
    }
}
