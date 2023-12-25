package com.bootcoding.math_method;

import java.util.Scanner;

public class Power
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number and its power:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("The power of " + a +" is: " +Math.pow(a,b));
    }
}
