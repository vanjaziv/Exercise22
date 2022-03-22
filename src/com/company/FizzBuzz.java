package com.company;

public class FizzBuzz {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 100) {

            if ((number % 3 == 0) && (number % 5 == 0)) {
                System.out.println(" FizzBuzz");
            }
            else if (number % 5 == 0){
                System.out.println(" Buzz");
            }
            else if (number % 3 == 0){
                System.out.println(" Fizz");
            }
            else {
                System.out.println("" + number);
            }
            number++;
        }



        }

    }

