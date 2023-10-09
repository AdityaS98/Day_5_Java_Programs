package com.programs;

import java.util.Scanner;

public class VowelConsonants {
    public static void charCheck(char word) {
        switch (word) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(word + " is vowel");
                break;
            default:
                System.out.println(word + " is consonant");
        }
    }

    public static void main(String[] args) {


        System.out.println("Enter alphabet");

        char ch = UtilityClass.scannerChar();
        charCheck(ch);
    }
}
