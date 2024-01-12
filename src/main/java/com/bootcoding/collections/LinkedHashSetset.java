package com.bootcoding.collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

import java.util.Set;

public class LinkedHashSetset {
    public static void main(String[] args) {
        LinkedHashSet lh = new LinkedHashSet();
        lh.add(3);
        lh.add("Upanshu");
        lh.add(34.54);
        lh.add("Spetator");
        lh.add(2);

        System.out.println(lh);
        System.out.println(lh.size());
        Iterator itr=lh.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
