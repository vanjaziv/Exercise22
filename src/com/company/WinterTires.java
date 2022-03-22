package com.company;

public class WinterTires {
    public static void main(String[] args) {
        if (needWinterTires(1, false)) {
            System.out.println("Please use winter tires");
        } else {
            System.out.println("Winter tires are not required");
        }
    }
    public static boolean needWinterTires(int temperature, boolean slipperyRoad){
        if (temperature < 4 || temperature < 10 && slipperyRoad) {
            return true;
        } else {
            return false;
        }
    }
}
