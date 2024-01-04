package com.bootcoding.abstraction;

abstract class Parent{
    abstract void purchase();
}
class Child1 extends Parent{
    @Override
    void purchase() {
        System.out.println("I want Bugatti Chiron");
    }
}
class Child2 extends Child1{
    @Override
    void purchase() {
      //  super.purchase();
        System.out.println("I want Mustang");
    }
}
class Child3 extends Child2{
    @Override
    void purchase() {
       // super.purchase();
        System.out.println("I want Ferrari");
    }
}
public class ParentApp {
    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        ch1.purchase();
        Child2 ch2 = new Child2();
        ch2.purchase();
        Child3 ch3 = new Child3();
        ch3.purchase();
    }
}
