package com.bootcoding.array;

import java.util.Scanner;

public class StringArray
{
    public static String longestArray(String[] array){
        String longest = "";
        for (String str : array){
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        return longest;
    }

    public static String shortestArray(String[] array) {
        String shortest = array[0];
        for (String str : array) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }
        return shortest;
    }

    public static String concatenate(String[] array) {
        StringBuilder result = new StringBuilder();
        for (String str : array) {
            result.append(str);
        }
        return result.toString();
    }

    public static boolean search(String[] array, String searchString) {
        for (String str : array) {
            if (str.equals(searchString)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String[] stringArray = {"upanshu", "sanjay", "bawankar", "apple", "orange"};

        String longestString = longestArray(stringArray);
        String shortestString = shortestArray(stringArray);

        System.out.println("Longest string: " + longestString);
        System.out.println("Shortest string: " + shortestString);


        String concatenatedString = concatenate(stringArray);
        System.out.println("Concatenated string: " + concatenatedString);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to search in the array: ");
        String searchString = sc.next();

        boolean isStringPresent = search(stringArray, searchString);
        if (isStringPresent) {
            System.out.println("The string '" + searchString + "' is present in the array.");
        } else {
            System.out.println("The string '" + searchString + "' is NOT present in the array.");
        }
    }
}

