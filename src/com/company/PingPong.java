package com.company;

public class PingPong {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 100) {
            System.out.println(counter);

            if (counter %6 == 0){
                System.out.println(" ping pong");
            }
            if (counter % 3 == 0){
                System.out.println(" pong");
            }
            if (counter % 2 == 0){
                System.out.println(" ping");
            }
            else {
                System.out.println(" -");
            }
            counter++;
        }

        for (int i = 1; i <= 100  ; i++) {
            System.out.println(i);
            if (i % 6 == 0){
                System.out.println(" ping pong");
            }
            if (i % 3 == 0){
                System.out.println(" pong");
            }
            if (i % 2 == 0){
                System.out.println(" ping");
            }
            else {
                System.out.println(" -");
            }
        }
    }
}
