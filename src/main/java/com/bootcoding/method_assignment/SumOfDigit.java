package com.bootcoding.method_assignment;

import java.util.Scanner;

public class SumOfDigit {
    public static int calculate(int num)
    {
        int sum = 0;

        while (num != 0)
        {
            sum = sum + num % 10;
            num = num / 10;
        }


        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter digit:");
        int n = sc.nextInt();
        System.out.println(calculate(n));

    }
}
