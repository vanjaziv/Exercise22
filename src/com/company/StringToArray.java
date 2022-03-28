
package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringToArray {

public static void main(String[]args){
    for(int i=1; i<=100; ++i){
    }
    String [] ar = new String[100];
    for(int i=0; i<100; ++i){
        ar[i]=(NumberToString(i));
        }
        System.out.println(Arrays.toString(ar));
        }
        private static String NumberToString(int i) {
        if ((i %3==0)&&(i %5==0)){
        return"FizzBuzz";
        }
        else if (i %3==0){
        return"Fizz";
        }
        else if(i %5==0){
        return"Buzz";
        }
        else {
        return Integer.toString(i);
        }

    }

}
