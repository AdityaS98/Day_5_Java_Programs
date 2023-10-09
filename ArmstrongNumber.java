package com.programs;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void numberChecker(int number) {
        int temp = 0, rem = 0;
        number = temp;
        int arm = 0;


        while (number > 0) {
            rem = number % 10;
            arm = (rem * rem * rem) + arm;
            System.out.println(rem);
            number = number / 10;

        }
        if (temp == arm) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an armstrong Number");
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter Number");

        int number = UtilityClass.scannerInt();
        numberChecker(number);
    }
}
