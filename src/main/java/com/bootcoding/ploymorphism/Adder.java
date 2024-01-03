package com.bootcoding.ploymorphism;
// This is Method Overloading
public class Adder {
    void add(int a){

        System.out.println("this is integer method ");
    }
    void add(String a){
        System.out.println("this is String method");
    }

    public static void main(String[] args) {
        Adder a = new Adder();
        a.add("abc");

    }
}
