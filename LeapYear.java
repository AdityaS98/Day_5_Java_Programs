package com.programs;


import java.util.Scanner;

public class LeapYear {
    public static void leapYears(int year) {

        if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a leap year");
        }
    }

    public static void main(String[] args) {


        System.out.println("Enter the year");
        int year = UtilityClass.scannerInt();
        leapYears(year);


    }


}

