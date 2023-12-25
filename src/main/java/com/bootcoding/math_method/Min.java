package com.bootcoding.math_method;

import java.util.Scanner;

public class Min
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("The Smallest number is:"+ Math.min(a,b));
    }
}
