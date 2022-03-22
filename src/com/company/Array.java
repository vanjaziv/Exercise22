package com.company;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
    int[] original = new int[] {1, 2, 3, 4};
        System.out.println("original order:" + Arrays.toString(original));
        int[] newlyOrdered = reverse(original);
        System.out.println("New order: " + Arrays.toString(newlyOrdered));

    }
    public static int [] reverse(int[] original) {
        int[] newOrderArray = new int[original.length];
        for (int i = original.length -1; i>=0; i--){
            newOrderArray[original.length - 1 - i] = original[i];
        }
        return  newOrderArray;
    }
}
