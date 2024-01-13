package com.bootcoding.collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        Map<Integer, String> h = new HashMap<>();
        h.put(1,"Upanshu");
        h.put(2,"Ankus");
        h.put(30,"Agastya");
        h.put(90,"Krutik");
        h.put(101,"Ram");
        h.put(300,"Shabbir");
        System.out.println(h);

        System.out.println(h.size());
        System.out.println(h.remove(300));
        System.out.println(h.put(90,"hjh"));
        System.out.println(h.get(101));
        System.out.println(h.isEmpty());

    }
}
