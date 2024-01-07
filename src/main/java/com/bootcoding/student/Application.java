package com.bootcoding.student;

import com.bootcoding.student.service.StudentService;

public class Application {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        studentService.processData();
    }
}
