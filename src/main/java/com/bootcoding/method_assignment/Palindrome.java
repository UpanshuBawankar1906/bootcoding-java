package com.bootcoding.method_assignment;

import java.util.Scanner;

public class Palindrome
{

    static int palindrome(int num )
    {
        int sum=0,r;
        while(num!=0)
        {
            r = num % 10;
            sum = (sum * 10) + r;
            num/= 10;
        }
        return sum;
    }

    public static void main(String arg[])
    {
        int n,t,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number ");
        n=sc.nextInt();
        t=n;
        s = palindrome(n);
        if(s == t) {
            System.out.println(t + " is a palindrome number ");
        }
        else {
            System.out.println(t + " is not a palindrome number ");
        }
    }
}


