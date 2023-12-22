package com.bootcoding.method_assignment;

import java.util.Scanner;

public class Addition
{
    public static int addition(int a, int b)
    {
        int s = a + b;

        return s;
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second Number");
        int b = sc.nextInt();

        int sum = addition(a,b);
        System.out.println("The addition of given number is:"+sum);
        
    }
}
