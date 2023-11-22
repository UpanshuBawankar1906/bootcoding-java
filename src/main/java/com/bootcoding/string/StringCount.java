package com.bootcoding.string;
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


