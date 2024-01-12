package com.bootcoding.collections;

import java.util.Iterator;
import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<Integer> st = new java.util.TreeSet<>();
        st.add(2);
        st.add(45);
        st.add(23);
        st.add(90);
        st.add(80);
        st.add(70);
        System.out.println(st);

        st.remove(45);
        System.out.println(st);
        st.contains(90);
        System.out.println(st);
        System.out.println(st.isEmpty());
        st.iterator();
        Iterator itr=st.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
