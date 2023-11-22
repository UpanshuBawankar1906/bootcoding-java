package com.bootcoding.string;
//import jdk.internal.icu.impl.CharacterIteratorWrapper;

import java.util.Scanner;
public class Convert
{
    public static void main (String[] args)
    {
        java.util.Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        System.out.println("length = "+str1.length());
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
    }

}
