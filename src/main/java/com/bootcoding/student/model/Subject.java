package com.bootcoding.student.model;

public class Subject {
    String lecture_name;
    int semister;
    double total_marks;
    double obtain_marks;

    public String getLecture_name() {
        return lecture_name;
    }

    public void setLecture_name(String lecture_name) {
        this.lecture_name = lecture_name;
    }

    public int getSemister() {
        return semister;
    }

    public void setSemister(int semister) {
        this.semister = semister;
    }

    public double getTotal_marks() {
        return total_marks;
    }

    public void setTotal_marks(double total_marks) {
        this.total_marks = total_marks;
    }

    public double getObtain_marks() {
        return obtain_marks;
    }

    public void setObtain_marks(double obtain_marks) {
        this.obtain_marks = obtain_marks;
    }



}
