package com.bootcoding.string;
//Write a program that takes a string and a number as input, then prints the string repeated that number of times.
import java.util.Scanner;

public class RepeateString
{
    public static void main(String[]args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        System.out.println("Enter the number of times to repeat the string: ");
        int numTimes = scanner.nextInt();
        String repeatedString = " ";
        for (int i = 0; i < numTimes; i++)
        {
            repeatedString  += inputString;
        }
        System.out.println("The repeated string is: " + repeatedString);
    }

}
