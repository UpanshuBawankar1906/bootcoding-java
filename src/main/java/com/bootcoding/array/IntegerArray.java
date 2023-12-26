package com.bootcoding.array;

public class IntegerArray
{
    public static void main(String[] args) {
        int [] a = {1, 2, 3, 4, 5, 6 };
        int sum = 0;
        double avg = 0;
        int max = Maximum(a);
        int min = Minimum(a);

        for (int i = 0; i< a.length;i++)
        {
            sum = sum + a[i];
        }
            avg = (double)sum / a.length;


        System.out.println("The sum of the given array is:" + sum);
        System.out.println("Average of given array is: " + avg);
        System.out.println("The Maximum element from an array is:" + max);
        System.out.println("The Manimum element from an array is:" + min);



    }
    public static int Maximum(int[] a){
        int maximum = a[0];
        for (int i = 1; i < a.length; i++)
        {
            if (a[i] > maximum)
            {
                maximum = a[i];
            }
        }
        return maximum;
    }
    public static int Minimum(int[] a){
        int minimum = a[0];
        for (int i = 1; i > a.length;i++)
        {
            if (a[i] > minimum)
            {
                minimum = a[i];
            }
        }
        return minimum;
    }

    }

