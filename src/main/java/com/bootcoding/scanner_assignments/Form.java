package com.bootcoding.scanner_assignments;

import java.util.Scanner;

public class Form
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your number");
        Double number = sc.nextDouble();
        System.out.println("Enter your gender");
        char gender = sc.next().charAt(0);
        System.out.println("Enter your salary");
        Double salary = sc.nextDouble();
        System.out.println("**** Your Profile ****");
        System.out.println("Name:"+name);
        System.out.println("Contact Number:"+number);
        System.out.println("Gender:"+gender);
        System.out.println("Salary:"+salary);
    }
}
