package com.programs;

import java.util.Scanner;

public class Harmonic {

    public static void harmonicFinder(int number) {
        double sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += (double) 1 / i;
        }
        System.out.println("The " + number + " harmonic term is " + sum);
    }


    public static void main(String[] args) {

        System.out.println("Enter nth number to find harmonic");

        int number = UtilityClass.scannerInt();
        harmonicFinder(number);

    }
}
