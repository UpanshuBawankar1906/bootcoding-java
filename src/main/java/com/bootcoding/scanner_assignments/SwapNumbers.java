package com.bootcoding.scanner_assignments;

import java.util.Scanner;

public class SwapNumbers
{
    public static void main(String[] args)
    {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and y:");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("The Original Numbers of x is  "+ x);
        System.out.println("The Original Numbers of y is  "+ y);
        System.out.println();

        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("The Swapped Numbers of x is  "+ x);
        System.out.println("The Swapped Numbers of y is  "+ y);
    }
}
