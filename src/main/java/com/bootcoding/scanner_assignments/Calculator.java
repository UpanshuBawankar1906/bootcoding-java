//Create a basic calculator that can perform addition, subtraction, multiplication, and division. by taking inputs from the user .
package com.bootcoding.scanner_assignments;

import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args)
    {
        double a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers:");
        a = sc.nextInt();
        b = sc .nextInt();

        System.out.println("Enter Operator:");
        char op = sc.next().charAt(0);
        double o = 0;

        switch (op)
        {
            case '+':
                o = a + b;
            break;

            case '-':
                o = a - b;
            break;

            case '*':
                o = a * b;
            break;

            case '/':
                o = a / b;
            break;

            case '%':
                o = a % b;
            break;

            default:
                System.out.println("You enter wrong input");
        }

        System.out.println("Result:");

        System.out.println(a + " " + op + " " + b + " = " + o);
    }
}
