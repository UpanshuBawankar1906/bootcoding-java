package com.bootcoding.constructor;

public class MultiConst
{
   String name;
   int age;
   int id;

    MultiConst(String name){
        this.name = name;

    }
    MultiConst(String name, int age){
        this.name = name;
        this.age = age;
    }
    MultiConst(int id){
        this.id = id;
    }

    public static void main(String[] args) {
        MultiConst m1 = new MultiConst("Upanshu");
        MultiConst m2 = new MultiConst("Upanshu", 23);
        MultiConst m3 = new MultiConst(102);

        System.out.println("Constructro 1: "+ m1.name);
        System.out.println("Constructro 2: "+ m2.name +" "+ m2.age);
        System.out.println("Constructro 3: "+ m3.id);
    }
}
