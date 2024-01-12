package com.bootcoding.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {
    public static void main(String[] args) {


        ArrayList al = new ArrayList();
        al.add(2);
        al.add(3.4);
        al.add("Upanshu");
        al.add("Fruit");
        al.add("Bawankar");

        System.out.println(al);
        al.set(3,"sanjay");
        al.remove(2);
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
