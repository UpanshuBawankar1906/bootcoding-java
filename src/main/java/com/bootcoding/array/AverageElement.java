package com.bootcoding.array;

public class AverageElement {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int sum = 0, avg = 0;
        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];

        System.out.println("sum :: " + sum);
        avg = sum / arr.length;
        System.out.println("Average: " + avg);
    }
}

