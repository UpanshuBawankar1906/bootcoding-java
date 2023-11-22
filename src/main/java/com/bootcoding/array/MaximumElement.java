package com.bootcoding.array;
import java.io.PrintStream;
public class MaximumElement
{
        public static void main(String[] args)
        {
            int[] array = {1, 4, 6, 8, 100, 12, 15};
            int maximumElement = findMaximumElement(array);
            System.out.println("The Maximum Element in the Array is: " + maximumElement);
        }
        private static int findMaximumElement(int[] array)
        {
            int maximumElement = array[0];
            for (int i = 1; i < array.length; i++)
            {
                if (array[i] > maximumElement)
                {
                    maximumElement = array[i];
                }
            }
            return maximumElement;
        }
}

