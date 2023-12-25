package com.bootcoding.math_method;

import java.util.Scanner;

public class Floor
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        float a = sc.nextFloat();
        System.out.println(Math.floor(a));
    }
}
