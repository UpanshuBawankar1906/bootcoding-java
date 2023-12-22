package com.bootcoding.method_assignment;

import java.util.Scanner;

public class Factorial
{
        static int factorial(int n){
            if (n == 0)
                return 1;
            else
                return(n * factorial(n-1));
        }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            int i,fact = 1;
            fact = factorial(number);
            System.out.println("Factorial of "+number+" is: "+fact);
        }
    }

