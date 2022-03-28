package com.company;

import java.util.Arrays;

public class ArrayRow {
    public static void main(String[] args) {
        int rows;
        int columns;
        int[][] Employees = new int[100][1];

        for (rows = 1; rows < 100; rows++) {
            for (columns = 1; columns < 1; columns++)
            {
                Employees[rows][columns] = rows + columns;
                System.out.println(Arrays.deepToString(Employees));
            }
        }
    }
}