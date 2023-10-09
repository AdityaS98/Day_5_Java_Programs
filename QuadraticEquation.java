package com.programs;

import java.util.Scanner;

public class QuadraticEquation {
    public static void rootCalculation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Root 1 of x = " + root1);
            System.out.println("Root 2 of x = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Root of x = " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Root 1 of x = " + "x" + realPart + " + " + "i" + imaginaryPart + "i");
            System.out.println("Root 2 of x = " + "x" + realPart + " - " + "i" + imaginaryPart + "i");
        }


    }

    public static void main(String[] args) {


        System.out.println("Enter the value of the varaibles");

        double num1 = UtilityClass.scannerDouble();
        double num2 = UtilityClass.scannerDouble();
        double num3 = UtilityClass.scannerDouble();

        rootCalculation(num1, num2, num3);

    }
}

