package com.programs;

import java.util.Scanner;

public class QuoRem {
    public static void mathOperation(int number) {
        int rem = number % 10;
        int quo = number / 10;
        System.out.println("Quotient " + quo);
        System.out.println("Remainder" + rem);
    }

    public static void main(String[] args) {

        System.out.println("Enter Number");
        int num = UtilityClass.scannerInt();
        mathOperation(num);
    }
}
