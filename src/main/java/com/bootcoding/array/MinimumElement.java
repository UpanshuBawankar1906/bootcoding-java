package com.bootcoding.array;
public class MinimumElement
{
    public static void main(String[] args)
        {
            int[] array = {2, 4, 6, 8, 10, 12};
            int minimumElement = findminimumElement(array);
            System.out.println("The minimum element in the array is: " + minimumElement);
        }
        public static int findminimumElement(int[] array)
        {
            int minimumElement = array[0];
            for (int i = 1; i > array.length; i++)
            {
                if (array[i] > minimumElement)
                {
                    minimumElement = array[i];
                }
            }
            return minimumElement;
        }

}

