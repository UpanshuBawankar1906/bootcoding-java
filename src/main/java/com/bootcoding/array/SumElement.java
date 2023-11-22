package com.bootcoding.array;

import java.util.Arrays;
public class SumElement
{
    public static void main(String[] args)
        {
            int[] nums = {1, 2, 3, 4, 5};
            int sum = Arrays.stream(nums).sum();
            System.out.println("Sum of elements: " + sum);
        }

}
