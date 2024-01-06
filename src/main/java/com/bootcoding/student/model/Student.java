package com.bootcoding.student.model;

public class Student {
    String name;
    int roll_no;
    Subject[] subject;

    public Subject[] getSubject() {
        return subject;
    }

    public void setSubject(Subject[] subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }
}