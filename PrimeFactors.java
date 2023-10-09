package com.programs;

import java.util.Scanner;

public class PrimeFactors {
    public static void primeFactorisatio(int number) {
        for (int i = 2; i < number; i++) {
            while (number % i == 0) {
                System.out.println(i + " ");
                number = number / i;
            }
        }
        System.out.println(number);

    }


    public static void main(String[] args) {

        System.out.println("Enter the number");
        int number =UtilityClass.scannerInt();
        primeFactorisatio(number);
    }
}
