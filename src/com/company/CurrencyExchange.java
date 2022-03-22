package com.company;

public class CurrencyExchange {
    public static void main(String[] args) {
        double convertedValue1 = exchangeCurrency("HUF", 100);
        System.out.println("100 Euros convert to " + convertedValue1 + " HUF");

        double convertedValue2 = exchangeCurrency("SEK", 900);
        System.out.println("900 EUR convert to " + convertedValue2 + " SEK");
    }

    public static double exchangeCurrency(String currencyID, double value) {
        double convertedValue;
        // this is a perfect opportunity for a switch
        // there are only a handful of unique possibilities
        switch (currencyID) {
            case "HUF" -> convertedValue = value * 328.61;
            case "SEK" -> convertedValue = value * 10.76;
            case "USD" -> convertedValue = value * 1.12;
            case "CAD" -> convertedValue = value * 1.47;
            default -> {
                System.out.println(currencyID + " could not be converted.");
                convertedValue = value;
            }
        }
        return convertedValue;
    }

}