package com.bootcoding.string;
//Write a program to print the first and last characters of a given string.

public class PositionString
{
    public static void main(String[] args)
    {
        String str = "123456789";
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        System.out.println("First Character =" + first);
        System.out.println("Last Charater = " + last);

    }


}
