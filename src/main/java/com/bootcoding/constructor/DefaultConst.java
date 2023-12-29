package com.bootcoding.constructor;

public class DefaultConst
{
    String name;
    int age;
    public DefaultConst(){
        this.name = "Upanshu";
        this.age = 23;
        System.out.println("No Paramaterized constructor");
    }
    public String name() {
        return name;
    }
    public int age() {
        return age;
    }

    public static void main(String[] args) {
        DefaultConst d = new DefaultConst();
        System.out.println("Name: " + d.name());
        System.out.println("Age: " + d.age());
    }


}
