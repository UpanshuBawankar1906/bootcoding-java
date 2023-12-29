package com.bootcoding.constructor;

public class Employee {
    String name;
    int emp_id;
    public Employee(String name, int emp_id)
    {
        this.name = name;
        this.emp_id = emp_id;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Upanshu", 101);
        Employee e2 = new Employee("Bawankar", 102);
        Employee e3 = new Employee("Ankush", 103);

        System.out.println(e1.name +" "+e1.emp_id);
        System.out.println(e2.name +" "+e2.emp_id);
        System.out.println(e3.name +" "+e3.emp_id);



    }
}
