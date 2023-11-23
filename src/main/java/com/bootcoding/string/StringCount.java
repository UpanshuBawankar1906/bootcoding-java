package com.bootcoding.string;
//Write a program to count and print the number of words in a sentence.
import java.util.Scanner;
public class StringCount
{
    public static void main(String[] args)

    {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a sentence: ");
            String sentence = scanner.nextLine();
            String[] words = sentence.split(" ");
            int wordCount = words.length;
            System.out.println("The number of words in the sentence is: " + wordCount);
    }
}


