package com.programs;

import java.util.Random;
import java.util.Scanner;


public class CoinFlip {

    public static void main(String[] args) {

        int numFlips = UtilityClass.scannerInt();
        flipcoin(numFlips);
    }


    public static void flipcoin(int numFlips) {
        int headCount = 0;
        int tailCount = 0;
        for (int i = 0; i < numFlips; i++) {
            Random r = new Random();
            int x = r.nextInt();
            if (x < 0.5) {

                if (x < 0.5) {

                    headCount++;
                } else {

                    tailCount++;
                }
            }

        }
        System.out.println("Percentage of Head is : " + (headCount * 100) / numFlips);
        System.out.println("Percentage if Tails is : " + (tailCount * 100) / numFlips);
    }


}
