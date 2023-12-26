package com.bootcoding.array;

import javax.naming.PartialResultException;
import java.util.Scanner;

public class FloatingPointArray
{
    public static void main(String[] args) {
        
        float [] a = {23.2f, 34.4f, 51.3f, 78.6f, 97.8f};
        float n = a.length;
        System.out.printf("%f", product(a, n));
    }
    static float product(float a[], float n)
    {
        float result = 1;
        for (int i = 0; i < n; i++)
            result = result * a[i];
        return result;
    }
}
