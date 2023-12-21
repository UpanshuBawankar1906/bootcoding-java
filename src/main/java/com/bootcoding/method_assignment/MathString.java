package com.bootcoding.method_assignment;

import java.util.Scanner;
public class MathString
{
    public static double add(double a, double b)
    {
        return a + b;
    }
    public static double subtract (double a, double b)
    {
        return a - b;
    }
    public static double multiply (double a, double b)
    {
        return a * b;
    }
    public static double divide(double a, double b)
    {
        if (b != 0)
        {
            return a/b;
        }
        else
        {
            System.out.println("Cannot divide by zero");
        }
        return a;
    }
    public static double power(double a, double exponent)
    {
        if  (exponent == 0)
        {
             return 1;
        }
        else
        {
             return a * power(a, exponent - 1);
        }
    }
    public static double squareRoot(double a)
    {
        double t;
        double sqroot = a / 2;
        do
        {
            t = sqroot ;
            sqroot =(t + (a / t)) /2;
        }
        while((t - sqroot ) != 0);
        return sqroot ;
    }
    public static double factorial (double a)
    {
        if (a == 0 || a == 1)
        {
            return 1;
        }
        else
        {
            return a * factorial(a - 1);
        }
    }
    public static int stringLength(String str)
    {
        return str.length();
    }
    public static String concatenate(String str1, String str2)
    {
        return str1 + " " + str2;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number");
        double num1 = sc.nextDouble();

        System.out.println("Enter Second Number");
        double num2 = sc.nextDouble();

        System.out.print("Enter the exponent for exponentiation: ");
        double exponent = sc.nextDouble();

        System.out.print("Enter the string for string length: ");
        String str = sc.next();

        System.out.print("Enter the first string for concatenation: ");
        String str1 = sc.next();

        System.out.print("Enter the second string for concatenation: ");
        String str2 = sc.next();
        System.out.println();

        double sum = add(num1, num2);
        System.out.println("Addition: " + sum);

        double difference = subtract(num1, num2);
        System.out.println("Subtraction: " + difference);

        double quotient = divide(num1, num2);
        System.out.println("Division: " + quotient);

        double resultPower = power(num2, exponent);
        System.out.println("Power (Exponentiation): " + resultPower);

        double sqrtResult = squareRoot(num1);
        System.out.println("Square Root: " + sqrtResult);

        double factResult = factorial(num2);
        System.out.println("Factorial: " + factResult);

        int strLength = stringLength(str);
        System.out.println("String Length: " + strLength);

        String concatResult = concatenate(str1, str2);
        System.out.println("Concatenation: " + concatResult);

    }
}




