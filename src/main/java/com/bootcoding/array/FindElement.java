package com.bootcoding.array;

public class FindElement
{
    public static void main(String[] args)
        {
            int[] arr = {2, 5, 8, 12, 15, 18, 22, 25, 28, 32};
            int elementToSearch = 28;
            System.out.println(findElement(arr, elementToSearch));
        }
        public static int findElement(int[] arr, int elementToSearch)
        {
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] == elementToSearch)
                {
                    return i;
                }
            }
            return 0;
        }
}

