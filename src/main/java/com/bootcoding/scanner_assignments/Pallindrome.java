package com.bootcoding.scanner_assignments;

import java.util.Scanner;

public class Pallindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,sum=0,b;

        System.out.println("Enter the number:");
        int n = sc.nextInt();
        b = n;

        while(n > 0)
        {
            a = n % 10;  //getting remainder
            sum = (sum * 10) + a;
            n = n/10;
        }
        if(b == sum)
        {
            System.out.println("The given Number is Pallindrome");
        }
        else
        {
            System.out.println("The given Number is Not Pallindrome");
        }


    }
}
