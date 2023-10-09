package com.programs;

import java.util.Scanner;

public class GreatestInteger {
    public static void largestNumber(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("A is greatest");
        } else if (b > a && b > c) {
            System.out.println("B is greatest");
        } else {
            System.out.println("C is greatest");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int num1 = UtilityClass.scannerInt();
        int num2 = UtilityClass.scannerInt();
        int num3 = UtilityClass.scannerInt();
        largestNumber(num1, num2, num3);
    }
}
