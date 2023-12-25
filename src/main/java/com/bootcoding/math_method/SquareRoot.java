package com.bootcoding.math_method;

import java.util.Scanner;

public class SquareRoot
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Square of any number:");
        double a = sc.nextDouble();
        System.out.println("The Squreroot of " +a + " is: " + Math.sqrt(a));
    }
}
