package com.bootcoding.list;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.add("Upanshu");
        l1.add("Ankush");
        l1.add("Om");
        l1.add("Laxman");
        System.out.println(l1);
        l1.set(1,"Arjun");
        System.out.println(l1);
        l1.addFirst("Bootcoding");
        System.out.println(l1);
        l1.addLast("Shyam");
        System.out.println(l1);
        l1.contains("shyam");
        System.out.println(l1);

        LinkedList l2 = new LinkedList();
        l2.addAll(l1);
        System.out.println("l2 list"+l2);
        Iterator itr=l1.iterator();
        while(itr.hasNext()){
            System.out.println("l1 "+itr.next());
        }

    }
}
