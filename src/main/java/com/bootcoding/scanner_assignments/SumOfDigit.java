//Calculate the sum of the digits of a given integer.
package com.bootcoding.scanner_assignments;

import java.util.Scanner;

public class SumOfDigit
{
    public static void main(String[] args) {
        int num,digit,sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        num = sc.nextInt();
        while(num > 0)
        {
            digit = num % 10;

            sum = sum + digit;

            num = num / 10;
        }
        System.out.println("Sum of the Digit:" + sum);
    }
}
