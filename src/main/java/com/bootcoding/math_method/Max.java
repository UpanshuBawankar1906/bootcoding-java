package com.bootcoding.math_method;

import java.util.Scanner;

public class Max
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("The biggest number is:" + Math.max(a,b));
    }
}
