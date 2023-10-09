package com.programs;

import java.util.Scanner;

public class Array2dimensional {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int arr[] = new int[5];
        int res[] = arrayInput(arr);
        displayArray(res);// Passing array as Parameter
    }

    private static int[] arrayInput(int[] arr) {
        System.out.println("Enter the Array Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    private static void displayArray(int array[]) {
        System.out.println("Array Elemts are");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array " + array[i]);
        }
    }

}
