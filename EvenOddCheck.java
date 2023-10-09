package com.programs;

import java.util.Scanner;

public class EvenOddCheck {
    public static void Checker(int number) {
        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

    }

    public static void main(String[] args) {

        System.out.println("Enter Number");
        int num = UtilityClass.scannerInt();
        Checker(num);

    }
}
