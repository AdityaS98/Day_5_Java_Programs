package com.programs;

import java.util.Scanner;

public class DistanceCalculation {
    public static void euclideanDistance(double a, double b) {

        double formula = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("the distance is" + formula);

    }

    public static void main(String[] args) {

        double x = UtilityClass.scannerDouble();
        double y = UtilityClass.scannerDouble();
        euclideanDistance(x, y);
    }
}
