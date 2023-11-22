package com.bootcoding.array;

public class CopiedElement
{
    public static void main(String[] args)
        {
            int[] numbers = {1, 2, 3, 4, 5};
            int[] numbersCopy = new int[numbers.length];
            System.arraycopy(numbers, 0, numbersCopy, 0, numbers.length);
            System.out.print("Original array: ");
            for (int i = 0; i < numbers.length; i++)
            {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
            System.out.print("Copied array: ");
            for (int i = 0; i < numbersCopy.length; i++)
            {
                System.out.print(numbersCopy[i] + " ");
            }
            System.out.println();
        }
}


