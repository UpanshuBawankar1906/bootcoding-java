package com.bootcoding.array;

import java.util.Scanner;

public class CharacterArray {
    public static void main(String[] args) {
        char[] arr = {'a', 'e', 'i', 'o', 'u'};
        int arrayLength =  arr.length;
        System.out.println("The Length of an array is: " + arrayLength);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character you want to search: ");
        char a = sc.next().charAt(0);

        if (isCharPresent(arr, a)) {
            System.out.println("The character " + a + " is present in the array.");
        } else {
            System.out.println("The character " + a + " is NOT present in the array.");
        }
    }
    public static boolean isCharPresent(char[] array, char searchChar) {
        for (char ch : array) {
            if (ch == searchChar) {
                return true;
            }
        }
        return false;
    }
}

