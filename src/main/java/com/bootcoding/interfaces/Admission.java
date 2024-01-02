package com.bootcoding.interfaces;

import java.util.Scanner;

interface A1{
    void input();
    void output();

}

class principle implements A1{
    String name;
    double marks;
    String result;

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name of a Student: ");
        name = sc.nextLine();
        System.out.println("Enter result: ");
        result = sc.nextLine();
        System.out.println("Enter Marks obtain: ");
        marks = sc.nextDouble();

    }

    @Override
    public void output() {
        System.out.println("Name: "+name);
        System.out.println("Obtained Marks: "+marks);
        System.out.println("Result: "+result);

    }
}
public class Admission {
    public static void main(String[] args) {
        principle p = new principle();
        p.input();
        p.output();
    }
}
