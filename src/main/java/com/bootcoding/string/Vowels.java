package com.bootcoding.string;
//Count and print the number of vowels in a given string.
import java.util.Scanner;

public class Vowels
{
    public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a string: ");
            String str = scanner.nextLine();
            str = str.toLowerCase();
            int vowelCount = 0;
            for (int i = 0; i < str.length(); i++)
            {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                {
                    vowelCount++;
                }
            }
            System.out.println("The number of vowels in the string is: " + vowelCount);
        }
}

