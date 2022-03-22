package com.company;

public class SumArray {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4};
        System.out.println("the sum is:" + calculateSum(numbers));
    }
    public static int calculateSum(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }
        return sum;
    }
}
