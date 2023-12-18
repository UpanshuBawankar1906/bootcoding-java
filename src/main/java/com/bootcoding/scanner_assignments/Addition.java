package com.bootcoding.scanner_assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Addition
{
    public static void main(String[] args)
    {
        int a, b, c;
        System.out.println("Enter Two Numbers: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc .nextInt();
        c = a + b;
        System.out.println("Sum of the given numbers:"+c);



    }

}
