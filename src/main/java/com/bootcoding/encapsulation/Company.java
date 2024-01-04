package com.bootcoding.encapsulation;
class Employee{
    private int emp_id;
    private String name;

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getEmp_id() {
        return emp_id;
    }
    public void set_name(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Company {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmp_id(102);
        e.set_name("Upanshu");
        System.out.println("ID: "+ e.getEmp_id());
        System.out.println("Name: " + e.getName());

    }
}
