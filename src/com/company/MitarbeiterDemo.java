package com.company;

public class MitarbeiterDemo {
    public static void main(String[] args) {
        Mitarbeiter1 a = new Mitarbeiter1();
        System.out.println(a.taxableincome);
        System.out.println(a.taxableincome - a.tax);
    }
}
