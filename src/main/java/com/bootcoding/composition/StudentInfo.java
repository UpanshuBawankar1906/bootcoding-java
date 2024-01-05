package com.bootcoding.composition;

class Student{
    String name;
     int roll_no;
    Subject subject;
    Mobile mobile;
}
class Subject{
    String title;
    int totalMarks;
    int obtainMarks;
}
class Mobile{
    String brandName;
    long price;
}
public class StudentInfo {
    public static void main(String[] args) {
        Subject sub = new Subject();
        sub.title = "Math";
        sub.obtainMarks = 450;
        sub.totalMarks = 500;

        Mobile mob = new Mobile();
        mob.brandName = "Samsung";
        mob.price = 12500000;

        Student std = new Student();
        std.name = "Upanshu S. Bawankar";
        std.roll_no = 1234;
        std.mobile = mob;
        std.subject = sub;

        System.out.println("Name            : " + std.name);
        System.out.println("Roll no.        : " + std.roll_no);
        System.out.println("Subject         : " + std.subject.title);
        System.out.println("Total Marks     : " + std.subject.totalMarks);
        System.out.println("Obtained Marks  : " + std.subject.obtainMarks);
        System.out.println("Mobile Brand    : " + std.mobile.brandName);
        System.out.println("Mobile Price    : " + std.mobile.price);



    }
}
