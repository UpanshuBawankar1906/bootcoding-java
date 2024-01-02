package com.bootcoding.constructor;

public class School {
    String name;
    String house;
    int age;
    double rollno;

    School(String name){
        this.name = name;
        this.house = house;
    }
    School(int age){
        this.age = age;
    }
    School(double rollno){
        this.rollno = rollno;
    }

    public static void main(String[] args) {
        School s1 = new School("Upanshu"+" " + "RED");
        School s2 = new School(20);
        School s3 = new School(12.30);

        System.out.println("Constructor 1: "+ s1.name + " "+ s1.house);
        System.out.println("Constructor 2: "+ s2.age);
        System.out.println("Constructor 3: "+ s3.rollno);
    }

}
