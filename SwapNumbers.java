package com.programs;

import java.util.Scanner;

public class SwapNumbers {
    public static void Swapping(int num1, int num2) {
        System.out.println();
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After Swapping");
        System.out.println(num1);
        System.out.println(num2);

    }

    public static void main(String[] args) {

        System.out.println("Enter Numbers before swapping ");
        int a = UtilityClass.scannerInt();
        int b = UtilityClass.scannerInt();
        Swapping(a, b);
    }
}
