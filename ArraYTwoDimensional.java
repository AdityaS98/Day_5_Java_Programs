package com.programs;

class Matrix {
    public void inputElememnts() {

        System.out.println("Enter rows and coloumns");
        int rows = UtilityClass.scannerInt();
        int coloumns = UtilityClass.scannerInt();
        int[][] arr = new int[rows][coloumns];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumns; j++) {
                arr[i][j] = UtilityClass.scannerInt();
            }
        }
        System.out.println("Matrix:\n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < coloumns; j++) {

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

    }

}


public class ArraYTwoDimensional {
    public static void main(String[] args) {
        Matrix obj = new Matrix();
        obj.inputElememnts();
    }

}
