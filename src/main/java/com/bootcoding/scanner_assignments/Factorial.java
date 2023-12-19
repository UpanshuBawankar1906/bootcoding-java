//Create a program that calculates the factorial of a given number. Validate input to ensure it's a non-negative integer.
package com.bootcoding.scanner_assignments;

import java.util.Scanner;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i, fact = 1;
        System.out.println("Enter the number:");
        int a = sc.nextInt();
        for(i = 1; i <= a; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of " + a + " is: " + fact);

    }
}
