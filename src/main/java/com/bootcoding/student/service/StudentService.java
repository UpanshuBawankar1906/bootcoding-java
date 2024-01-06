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

        sub.setLecture_name("Chemistry");
        sub.setSemister(2);
        sub.setObtain_marks(84.5);
        sub.setTotal_marks(100);

        Student std = new Student();
        std.setName("Upanshu");
        std.setRoll_no(124);

        Result res = new Result();
        res.setRoll_no(std.getRoll_no());
        res.setPercentage( ((sub.getObtain_marks() / (double) sub.getTotal_marks()) * 100));
        res.setSemister(sub.getSemister());


    }
}
