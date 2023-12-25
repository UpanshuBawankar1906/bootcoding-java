package com.bootcoding.math_method;

import java.util.Scanner;

public class Round
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        double d = sc.nextDouble();
        System.out.println(Math.round(d));
    }
}
