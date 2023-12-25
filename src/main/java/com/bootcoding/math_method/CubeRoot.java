package com.bootcoding.math_method;

import java.util.Scanner;

public class CubeRoot
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the CubeRoot of any number:");
        double a = sc.nextDouble();
        System.out.println("The CubeRoot of " +a + " is: " + Math.cbrt(a));
    }
}
