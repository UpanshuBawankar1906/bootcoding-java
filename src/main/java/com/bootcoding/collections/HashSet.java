package com.bootcoding.collections;

import java.util.Iterator;
import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<String> hs = new java.util.HashSet<>();
        hs.add("Ravi");
        hs.add("Shiv");
        hs.add("krish");
        hs.add("Yash");
        hs.add("Upanshu");
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.remove("Krish"));
        System.out.println(hs.contains("Upanshu"));
        Iterator itr=hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println(hs.removeAll(hs));
        System.out.println(hs.isEmpty());
    }
}
