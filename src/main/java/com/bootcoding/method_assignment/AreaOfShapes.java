package com.bootcoding.method_assignment;

import java.util.Scanner;

public class AreaOfShapes
{
    public static void square()
    {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the side length of the square: ");
        double length = a.nextDouble();
        double area = length * length;

        System.out.println();
        System.out.println("The area of the square is: " + area);
    }
    public static void circle()
    {
        Scanner b = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = b.nextDouble();
        double sum = 3.142 * radius * radius;

        System.out.println();
        System.out.println("The area of the circle is: " + sum);
    }
    public static void triangle()
    {
        Scanner c = new Scanner(System.in);
        System.out.print("Enter the base length of the triangle: ");
        double base = c.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        double height = c.nextDouble();
        double res = 0.5 * base * height;

        System.out.println();
        System.out.println("The area of the triangle is: " + res);
    }

    public static void main(String[] args)
    {
        double square, circle, triangle;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Shape:");

        System.out.println("1 - Square");
        System.out.println("2 - Circle");
        System.out.println("3 - Triangle");
        System.out.println();
        int choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                square();
                break;

            case 2:
                circle();
                break;

            case 3:
                triangle();
                break;
        }
    }
}
