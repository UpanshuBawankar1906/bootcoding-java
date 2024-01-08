package com.bootcoding.student.service;

import com.bootcoding.student.model.Result;
import com.bootcoding.student.model.Student;
import com.bootcoding.student.model.Subject;



public class StudentService {
    public void processData(){
        Subject sub = new Subject();

        sub.setLecture_name("Physics");
        sub.setSemister(2);
        sub.setTotal_marks(100);
        sub.setObtain_marks(75.6);

        Subject sub2 = new Subject();
        sub2.setLecture_name("Chemistry");
        sub2.setSemister(2);
        sub2.setObtain_marks(85);
        sub2.setTotal_marks(100);

        Subject sub3 = new Subject();
        sub3.setLecture_name("Maths");
        sub3.setSemister(2);
        sub3.setObtain_marks(65);
        sub3.setTotal_marks(100);

        Subject sub4 = new Subject();
        sub4.setLecture_name("Electronics");
        sub4.setSemister(2);
        sub4.setObtain_marks(55);
        sub4.setTotal_marks(100);

        Student std = new Student();
        std.setName("Upanshu S Bawankar");
        std.setRoll_no(124);
       std.setSubject(new Subject[]{sub,sub2,sub3,sub4});

       Student std2 = new Student();
       std2.setName("Ankush");
       std2.setRoll_no(125);
       std2.setSubject(new Subject[]{sub,sub2,sub3,sub4});

       Student std3 = new Student();
       std3.setName("Tanmay");
       std3.setRoll_no(126);
        std3.setSubject(new Subject[]{sub,sub2,sub3,sub4});


        Result res = new Result();
        res.setRoll_no(std.getRoll_no());
        res.setPercentage( ((sub.getObtain_marks() + sub2.getObtain_marks() + sub3.getObtain_marks() +
                sub4.getObtain_marks()) / ( sub.getTotal_marks() + sub2.getTotal_marks() +
                sub3.getTotal_marks() + sub4.getTotal_marks()) * 100));
        res.setSemister(sub.getSemister());
//
//        System.out.println("Name of the Student  :"+" "+std.getName());
//        System.out.println("Roll number          :"+" "+std.getRoll_no());
//        System.out.println();
//        System.out.println("Name of the Subject  :"+" "+sub.getLecture_name());
//        System.out.println("Semester             :"+" "+sub.getSemister());
//        System.out.println("Marks Obtained       :"+" "+sub.getObtain_marks());
//        System.out.println("Out Of               :"+" "+sub.getTotal_marks());
//        System.out.println();
//        System.out.println("Name of the Subject  :"+" "+sub2.getLecture_name());
//        System.out.println("Semester             :"+" "+sub2.getSemister());
//        System.out.println("Marks Obtained       :"+" "+sub2.getObtain_marks());
//        System.out.println("Out of               :"+" "+sub2.getTotal_marks());
//        System.out.println();
//        System.out.println("Name of the Subject  :"+" "+sub3.getLecture_name());
//        System.out.println("Semester             :"+" "+sub3.getSemister());
//        System.out.println("Marks Obtained       :"+" "+sub3.getObtain_marks());
//        System.out.println("Out Of               :"+" "+sub3.getTotal_marks());
//        System.out.println();
//        System.out.println("Name of the Subject  :"+" "+sub4.getLecture_name());
//        System.out.println("Semester             :"+" "+sub4.getSemister());
//        System.out.println("Marks Obtained       :"+" "+sub4.getObtain_marks());
//        System.out.println("Out of               :"+" "+sub4.getTotal_marks());
//        System.out.println();
//        System.out.println("Percentage            :"+" "+res.getPercentage());

        System.out.println();
        for(Subject s : std.getSubject()){
            System.out.println(s.toString());

        }
        System.out.println();
        for (Subject s : std2.getSubject()){
            System.out.println(s.toString());
        }
        System.out.println();
        for (Subject s : std3.getSubject()){
            System.out.println(s.toString());
        }
    }
}
