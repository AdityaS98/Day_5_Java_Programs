package com.programs;

import java.util.Scanner;


public class Exponential {

    public static void powerCalculation(int num) {

        if (num < 31) {
            for (int i = 1; i < num; i++) {
                System.out.println("2 power " + i + " = " + Math.pow(2, i));
            }
        } else {
            System.out.println("Out of integer range");
        }
    }


    public static void main(String[] args) {

        System.out.println("Enter Range");
        int num = UtilityClass.scannerInt();
        powerCalculation(num);

    }
}



