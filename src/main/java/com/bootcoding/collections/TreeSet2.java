package com.bootcoding.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String[] args) {
        Set<String> st = new TreeSet<>();
        st.add("Ravi");
        st.add("Kishan");
        st.add("Ayush");
        st.add("Ankush");
        st.add("Upanshu");
        st.add("Bawankar");
        System.out.println(st);

        st.remove("Kishan");
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println(st.remove("Ayush"));

        Iterator itr=st.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
