package com.bootcoding.ploymorphism;

import java.util.Scanner;

public class Addition {
    void add (int a, int b){
        int s = a + b;
        System.out.println("The addition of given number is: "+ s);
    }
    void add(float a,float b){
        float s = a + b;
        System.out.println("The addition of float is: "+ s);
    }

    public static void main(String[] args) {

        Addition addition = new Addition();
        addition.add(10,20);
        addition.add(12.45f,10.67f);
    }
}
