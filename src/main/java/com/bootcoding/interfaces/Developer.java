package com.bootcoding.interfaces;
import javax.xml.namespace.QName;
import java.util.Scanner;

interface client{
    void input();
    void output();
}
class base implements client{
    String name;
    double sal;
    @Override
    public void input() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        name = sc.nextLine();
        System.out.println("Enter Salary: ");
        sal = sc.nextDouble();
    }

    @Override
    public void output() {
        System.out.println("Name: "+name);
        System.out.println("Salary: "+sal);

    }
}
public class Developer {
    public static void main(String[] args) {
        client c = new base();
        c.input();
        c.output();

    }
}
